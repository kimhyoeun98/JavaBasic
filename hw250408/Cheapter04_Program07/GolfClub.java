package Cheapter04_Program07;

public class GolfClub {
    private String name;

  
    public GolfClub() {
        this.name = "7번 아이언";
    }


    public GolfClub(int number) {
        this.name = number + "번 아이언";
    }

  
    public GolfClub(String name) {
        this.name = name;
    }

    public void print() {
        System.out.println(name);
    }
}
	


