package test;

import member.HJMemberService;
import member.HashMapMemberDAO;
import member.ListMemberDAO;
import member.MemberDAO;
import member.MemberService;
import member.MemberVO;
import member.file.FileMemberDB;
import member.file.TextFileHashMapMemberDAO;

public class MemberServiceTest {
	
	static MemberDAO memberDAO = new TextFileHashMapMemberDAO();
	static MemberService ms = new HJMemberService(memberDAO);

	
	public static void main(String[] args) {
		
		
		testSaveMembers();
		testLoadMembers();
	}
	
	
	public static void testLoadMembers() {
		((FileMemberDB)memberDAO).loadMembers();
		System.out.println(ms.listMembers());
		
		ms.registMember(new MemberVO("user1", "1234", "user1"));
		System.out.println(ms.listMembers());
		((FileMemberDB)memberDAO).saveMembers();
		
	}
	
	public static void testSaveMembers() {
		
		ms.registMember(new MemberVO("user1", "1234", "user1"));
		ms.registMember(new MemberVO("user2", "1234", "user2"));
		ms.registMember(new MemberVO("user3", "1234", "user3"));
		((FileMemberDB)memberDAO).saveMembers();
	}
	
	public void serviceTest() {
		
		
		
		
        ms = new HJMemberService(new HashMapMemberDAO());
		
		// 회원 등록
		ms.registMember(new MemberVO("user1", "1234", "user1"));
		ms.registMember(new MemberVO("user2", "1234", "user2"));
		ms.registMember(new MemberVO("user3", "1234", "user3"));
		
		// 회원 목록
		System.out.println(ms.listMembers());
		
		// 회원 상세 정보
		System.out.println(ms.detailMemberInfo("user2"));
		
		// 회원 정보 수정
		ms.updatePassword("user2", "1234", "1111");
		System.out.println(ms.listMembers());
		
		// 회원 삭제
		ms.removeMember("user2", "1111");
		System.out.println(ms.listMembers());
		
		// 로그인
		MemberVO loggedMember = ms.login("user3", "1234");
		System.out.println(loggedMember);
		
		// 정보 추가
		ms.addMemberInfo(loggedMember.getId(), "010-1234", "user1@kopo", "서울시 송파구");
		System.out.println(ms.listMembers());
	}
	
	static void DAOTest() {
		MemberDAO memberDAO = new ListMemberDAO();
		
		memberDAO.insertMember(new MemberVO("user1", "1234", "user1"));
		memberDAO.insertMember(new MemberVO("user2", "1234", "user2"));
		memberDAO.insertMember(new MemberVO("user3", "1234", "user3"));
		
		System.out.println(memberDAO.selectAllMembers());
		System.out.println(memberDAO.selectMember("user2"));
		
		MemberVO member = memberDAO.selectMember("user1");
		member.setPassword("1234");
		memberDAO.updateMember(member);
		
		member = memberDAO.selectMember("user3");
		member.setAddress("서울시 송파구");
		memberDAO.updateMember(member);
		
		member = memberDAO.selectMember("user3");
		member.setMobile("010-1234");
		memberDAO.updateMember(member);
		
		member = memberDAO.selectMember("user2");
		member.setEmail("user@kopo");
		memberDAO.updateMember(member);
		
		memberDAO.deleteMember("user2");
		System.out.println(memberDAO.selectAllMembers());
		
		
		
	}
}


