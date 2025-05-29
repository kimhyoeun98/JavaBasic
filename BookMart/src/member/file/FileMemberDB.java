package member.file;

public interface FileMemberDB {
	String DATA_FILE = "./data/MemberDB";
	void saveMembers();
	void loadMembers();

}
