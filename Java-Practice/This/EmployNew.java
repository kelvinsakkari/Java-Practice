class EmployNew{  
    int id;  
    String name;  
      
    EmployNew(int id,String name){  
    this.id = id;          //this keyword is used to distinguish between local variable and instance variable.
    this.name = name;  
    }  
    void display(){System.out.println(id+" "+name);}  
    public static void main(String args[]){  
    EmployNew s1 = new EmployNew(111,"Karan");  
    EmployNew s2 = new EmployNew(222,"Aryan");  
    s1.display();  
    s2.display();  
}  
}  