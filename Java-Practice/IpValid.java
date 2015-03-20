package Ip;

import java.util.Arrays;

public class IpValid {
	
	public static String check(String ip){
		String result="valid ip address";
		String[] temp;
		int count = ip.length() - ip.replace(".", "").length();
		int[] list={0,0,0};
		if(ip.length()<=15)
			list[0]=1;
		if(count==3){
			list[1]=1;
			temp = ip.split("\\.");
			for(int i=0;i<=3;i++){
				int foo = Integer.parseInt(temp[i]);
				if(foo<=255)
					list[2]=1;
				else{
					list[2]=0;
					break;
				}
			}
			
		}
		if(list[0]==0 | list[1]==0 | list[2]==0){
			
			if(list[0]==0)
				result="Invalid Ip - The ip address is exceeding the prescribed length";
			else if(list[1]==0)
				result="Invalid Ip - mismatch in ip address format, correct format would be 'xxx.xxx.xxx.xxx' where xxx<=255";
			else if(list[2]==0)
				result="Invalid Ip - exceeding the 0-255 range";
			}
		
		return result;
	}
	public static void main(String[] args) {
		String string = IpValid.check("255.1.3.3");
		System.out.println(string);
	}

}
