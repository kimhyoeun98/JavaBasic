package Cheapter04_Program03;

public class Member {
	private String name;
    private String id;
    private String password;
    private int age;

    public Member(String name, String id, String password, int age) {
        this.name = name;
        this.id = id;
        this.password = password;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public String getPassword() {
        return password;
    }

    public int getAge() {
        return age;
    }
}
	


