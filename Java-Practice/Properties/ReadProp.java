import java.util.*;  
import java.io.*;  
public class ReadProp {  
public static void main(String[] args)throws Exception{  
    FileReader reader=new FileReader("info.properties");  
      
    Properties p=new Properties();  
    p.load(reader);  
      
    System.out.println(p.getProperty("email"));  
    System.out.println(p.getProperty("name"));  
}  
}  