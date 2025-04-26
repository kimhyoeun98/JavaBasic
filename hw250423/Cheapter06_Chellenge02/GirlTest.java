package Cheapter_Chellenge02;

import chell2.BestGirl;
import chell2.Girl;
import chell2.GoodGirl;

public class GirlTest {
	public static void main(String[] args) {
		Girl g1 = new Girl();
		Girl g2 = new GoodGirl();
		GoodGirl gg = new BestGirl();
		
		g2.show();
		gg.show();
	}
}
