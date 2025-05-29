package member;

import java.util.LinkedList;
import java.util.List;

public class ListMemberDAO implements MemberDAO {
	
	
	private List<MemberVO> memberList = new LinkedList<MemberVO>();
	private int memberSeq = 111;

	@Override
	public boolean insertMember(MemberVO member) {
		member.setMemberNo(memberSeq);
		memberList.add(member);
		return true;
	}

	@Override
	public MemberVO selectMember(String id) {
		for (MemberVO member : memberList) {
			if (member.getId() == id)
				return member;
		}
		return null;
	}

	@Override
	public List<MemberVO> selectAllMembers() {
		return memberList;
	}

	@Override
	public boolean updateMember(MemberVO newMember) {
		for (int i = 0; i < memberList.size(); i++) {
			if (memberList.get(i).getMemberNo() == newMember.getMemberNo()) {
				memberList.set(i, newMember);
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean deleteMember(String id) {
	    for (MemberVO member : memberList) {
	        if (member.getId() == id) {
	            memberList.remove(member);
	            return true;
	        }
	    }
	    return false;
	}
}
