class Employ{  
    int id;           //parameters
    String name;  
      
    Employ(int id,String name){  
    id = id;           //Instance variables
    name = name;  
    }  
    void display(){System.out.println(id+" "+name);}  
  
    public static void main(String args[]){  
    	Employ s1 = new Employ(111,"Karan");  
    	Employ s2 = new Employ(321,"Aryan");  
    s1.display();  
    s2.display();  
    }  
}  

//parameters(local variables) and instance variables are same, unexpected output is coming due to ambiguity