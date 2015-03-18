import java.util.*;  
import java.io.*;  
public class CreateProp {  
public static void main(String[] args)throws Exception{  
  
Properties p=new Properties();  
p.setProperty("name","Kelvin Sakkari");  
p.setProperty("email","kelvinsakkari@gmail.com");  
  
p.store(new FileWriter("info.properties"),"Properties Example");  // creates and stores the properties file 'info.properties' if file not present otherwise overrides the existing file
  
}  
}  