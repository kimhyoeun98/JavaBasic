package Cheapter06_Programing05;

public class Smartphone extends Phone{
	private String game;
	
	public Smartphone(String owner, String game) {
		super(owner);
		this.game = game;
	}
	
	void playGame() {
		System.out.println(owner + "가 " + game + " 게임을 하는 중이다.");
	}

}
