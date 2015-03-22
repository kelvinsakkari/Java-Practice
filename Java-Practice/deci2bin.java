package SimpleInterest;

import java.util.ArrayList;
import java.util.Collections;

public class deci2bin {

	public static String calculate(int a){
		ArrayList<Integer> al=new ArrayList<Integer>();
		int rem;
		if(a>0){
		while(a>0){
			
			rem = (a%2);
			al.add(rem);
			a=a/2;
			
			}
		}
		else
			return "the input should be greater than 0";
		Collections.reverse(al);
		return al.toString().replaceAll("^\\[", "").replaceAll("\\]$", "").replace(",", "");
		
	}
	public static void main(String[] args) {
		String result = deci2bin.calculate(5);
		System.out.println(result);

	}

}
