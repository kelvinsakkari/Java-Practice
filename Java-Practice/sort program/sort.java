package com.sort;
import java.util.*;
class student implements Comparable<Object>{    
	 
	  String name;  
	  String branch;
	  int Rollno;
	  
	  student(int Rollno,String name,String branch){   //create a datastructure to hold student info
	     
	   this.name=name; 
	   this.Rollno=Rollno;
	   this.branch=branch;
       
	   
}
	 
	public int compareTo(Object o1) {         //the logic to sort the student names
		    if (this.name == ((student) o1).name)
		        return 0;
		    else if ((this.name.toUpperCase().charAt(0)) > ((student) o1).name.toUpperCase().charAt(0))
		        return 1;
		    else
		        return -1;
		}
	


}


class improve {
	 
	public static <T>  List<student> sort(List<student> al)  //sort method which takes list of student names as argument and returns a list
	   {
		
		Collections.sort(al);        //sorts the list 'al' according to the logic in compareTo 
		List<student> al1=new ArrayList<student>();   //create a object 'al1' of the type List<student>
		 Iterator<student> itr=al.iterator();  //the Iterator returns a pointer which points to the -1 index of the list
		  while(itr.hasNext()) {              //loop will run till the pointer reaches to the last element of the list
			 student st = (student)itr.next();  //'st' holds the element pointed to by the iterator
			  
			 al1.add(st);                      //puts the sorted elements into list 'al1'
			     
		  }
			return (al1); 
			  }
	
	 public static <E> void main(String[] args){ 
		 
              student s1=new student(1,"Sonoo","ECE");  
			  student s2=new student(2,"Ravi","CSE");  
			  student s3=new student(3,"Hanumat","EEE");
			  
			  
			  
			 List<student> al=new ArrayList<student>();
			 al.add(s1);
			 al.add(s2);
			 al.add(s3);
			 Collections.sort(al);
			 
			List<student> st1 = sort(al);
			 Iterator<student> itr=st1.iterator();  
			  while(itr.hasNext()) { 
				 student st2 = (student)itr.next();  
			System.out.println(st2.Rollno+" "+st2.name+" "+st2.branch); 
			  }  
		 }  

}	
	
	
	

