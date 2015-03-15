    class Employee{  
     float salary=40000;  
    }  
    class inherit extends Employee{  
     int bonus=10000;  
     public static void main(String args[]){  
       inherit p=new inherit();  
       System.out.println("Programmer salary is:"+p.salary);  
       System.out.println("Bonus of Programmer is:"+p.bonus);  
    }  
    }  