import java.io.*;  
public class ByteArray {
	
	
	
	 
	 public static void main(String args[])throws Exception{  
		 try {
			 
		 
		  FileOutputStream fout1=new FileOutputStream("/home/kelvin/Documents/javapractice/Write2file/src/test.txt");   //create a new instance of file output stream and make it point to a text file 
		  FileOutputStream fout2=new FileOutputStream("/home/kelvin/Documents/javapractice/Write2file/src/test2.txt");  
		  
		  ByteArrayOutputStream bout=new ByteArrayOutputStream(); //stream to send byte array 
		  String toRead = "helookjvhviuhvhvhjvvgxvg";
		  byte string[] = toRead.getBytes();   //converting string into array of bytes
		  bout.write(string);     //initialise bout with string to b written
		  bout.writeTo(fout1);   //specify the text file in which the string is to b written
		  bout.writeTo(fout2);  
		  
		  bout.flush();  
		  bout.close();  
		  System.out.println("success...");  
		
			
		} catch(Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		 }
	 }  
}

 
