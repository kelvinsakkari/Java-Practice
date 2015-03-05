
public class Immutable {

	
	public static void main(String args[]){  
		   String s="Kelvin";  
		   s.concat(" Sakkari");//concat() method appends the string at the end 
		   System.out.println("Expected output is 'Kelvin Sakkari'");
		   System.out.println("Got output is :");
		   System.out.println(s);//will print 'Kelvin' because strings are immutable objects  
		   System.out.println("---------------------------------------------------------");
		   System.out.println("Expected output is 'Kelvin Sakkari'");
		   System.out.println("Got output is :");
		   s=s.concat(" Sakkari");  //explicitely assign it to the reference variable
		   System.out.println(s); 
		  
		   
/* two objects are created 'Kelvin' and 'Kelvin Sakkari' but 's' reference variable still refers to 'Kelvin' not to 'Kelvin Sakkari'.
But if we explicitely assign it to the reference variable, it will refer to 'Kelvin Sakkari' object */
	}  

}
