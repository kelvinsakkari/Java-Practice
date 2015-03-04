import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


public class string {
	
	private static Scanner r;
	static String s;
	static String in;
	static String in1;

	public static void getEmailSegment(String emailAddress, String WhatInfo){
		String[] temp = emailAddress.split("@");
		System.out.println("Split Method :");
		if(WhatInfo.contentEquals("username"))
		{
			
			System.out.println("the username is : "+temp[0]);
	
		}
		else if(WhatInfo.contentEquals("domain")){
			System.out.println("the domain is : "+temp[1]);
			
		}
	}
	public static void getEmailSegment1(String emailAddress, String WhatInfo){
		System.out.println("Sub String Method :");
		if(WhatInfo.contentEquals("username"))
		{
			String temp = emailAddress.substring(0, emailAddress.indexOf("@"));
			System.out.println("the username is : "+temp);
	
		}
		else if(WhatInfo.contentEquals("domain")){
			String temp = emailAddress.substring(emailAddress.indexOf("@")+1);
			System.out.println("the domain is : "+temp);
			
		}
	}
	public static void main(String[] args) throws IOException {
		//r = new Scanner(System.in);
		 BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the email address :");
		s = bufferRead.readLine();
		System.out.println("Enter the string which u want username or domain");
		in = bufferRead.readLine();
		getEmailSegment(s,in);
		getEmailSegment1(s,in);
		
	     
		
	}

}
