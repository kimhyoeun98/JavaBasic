package Cheapter_Chellenge03;

import chell3.BestGirl;
import chell3.Girl;
import chell3.GoodGirl;

public class GirlTest {
	public static void main(String[] args) {
		Girl[] girls = {new Girl("갑순이"), new GoodGirl("콩쥐"), new BestGirl("황진이")};
		
		for(Girl g : girls) {
			g.show();
		}
	}
}
