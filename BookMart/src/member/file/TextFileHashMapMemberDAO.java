package member.file;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import member.HashMapMemberDAO;
import member.MemberVO;

public class TextFileHashMapMemberDAO extends HashMapMemberDAO implements FileMemberDB {
	
  
	private String dataFilename = DATA_FILE + ".txt";
	private final String DATE_FORMAT = "yyyy-MM-dd HH:mm:ss";
	
	@Override
	public void saveMembers() {
		
		try (
				FileWriter fw = new FileWriter(dataFilename);
				PrintWriter pw = new PrintWriter(fw);
			){
			
			for (MemberVO member : memberDB.values()) {
				pw.println(member.getMemberNo());
				pw.println(member.getId());
				pw.println(member.getPassword());
				pw.println(member.getUsername());
				pw.println(member.getMobile());
				pw.println(member.getEmail());
				pw.println(member.getAddress());
				
				SimpleDateFormat sdf = new SimpleDateFormat(DATE_FORMAT);
				pw.println(sdf.format(member.getRegDate()));
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	@Override
	public void loadMembers() {
		
		try ( FileReader fr = new FileReader(dataFilename);
				  BufferedReader br = new BufferedReader(fr);
			) {
			
			while (br.ready()) {
                int memberNo = Integer.parseInt(br.readLine());
				String id = br.readLine().strip();
				String password = br.readLine().strip();
				String username = br.readLine().strip();
				String mobile = br.readLine().strip();
				String email = br.readLine().strip();
				String address = br.readLine().strip();
				
				SimpleDateFormat sdf = new SimpleDateFormat(DATE_FORMAT);
				Date regDate = sdf.parse(br.readLine());
				
				memberDB.put(id, new MemberVO(memberNo, id, password, username, mobile, email, address, regDate));
				
				if (memberSeq <= memberNo) memberSeq = memberNo + 1;				
			}			
		} catch (FileNotFoundException e) {
			System.out.println("[로딩] " + dataFilename + "이 없습니다.");
		} catch (IOException | ParseException e) {
			e.printStackTrace();
		}
		
	}

	
	

}
