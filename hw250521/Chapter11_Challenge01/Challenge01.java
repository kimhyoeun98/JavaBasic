package Chapter11_Challenge01;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Challenge01 {
	 public static void main(String[] args) {
		    
	        List<String> capitals = new ArrayList<>();

	   
	        capitals.add("서울");
	        capitals.add("워싱턴");
	        capitals.add("베이징");
	        capitals.add("파리");
	        capitals.add("마드리드");

	       
	        capitals.add("서울");

	       
	        for (String capital : capitals) {
	            System.out.print(capital + " ");
	        }
	        System.out.println();

	      
	        List<String> uniqueCapitals = new ArrayList<>(new HashSet<>(capitals));
	        
	      
	        uniqueCapitals.add("런던");

	       
	        for (String capital : uniqueCapitals) {
	            System.out.print(capital + " ");
	        }
	        System.out.println();

	      
	        uniqueCapitals.removeIf(capital -> capital.length() >= 3);

	       
	        for (String capital : uniqueCapitals) {
	            System.out.print(capital + " ");
	        }
	        System.out.println();
	    }
	}