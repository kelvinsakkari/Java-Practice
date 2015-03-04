package com.sort;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.sort.improve; //importing required classes or path to the required classes  
import com.sort.student;
public class sortTest {
	List<student> st1;
	List<student> al;
	@Before                                   // '@Before' under this tag we can write method to initialize or declare variables
	public void init(){
		student s1=new student(1,"Sonoo","ECE");  
		  student s2=new student(2,"Ravi","CSE");  
		  student s3=new student(3,"Hanumat","EEE");
		 al=new ArrayList<student>();
			 al.add(s1);
			 al.add(s2);
			 al.add(s3);
	//'al' is the input unsorted array 
		
			 
			 System.out.println("---------------------Input array-------------------");
			 Iterator<student> itr1=al.iterator(); 
			 while(itr1.hasNext()) { 
				 student st3 = (student)itr1.next();  
			System.out.println(st3.Rollno+" "+st3.name+" "+st3.branch); 
			 }
			 st1 = improve.sort(al);// 'st1' has the sorted list which is returned from sort method present in improve class
			 
			 Collections.sort(al);
			
			
			 System.out.println("--------------Sorted array got from sort method--------------");
			 Iterator<student> itr=st1.iterator();  
			  while(itr.hasNext()) { 
				 student st2 = (student)itr.next();  
			System.out.println(st2.Rollno+" "+st2.name+" "+st2.branch); 
			
			  }
	}

	@Test
	public void testCheckStudentResponseNotNull() {
		
		assertNotNull(st1);
		assertEquals(3,st1.size());
		assertEquals(al, st1);  
	
	}
	/*@Test
	public void testCheckStudentResponseSize() {
		assertEquals(3,st1.size());
	}*/
	
	/*@Test
	public void testCheckStudentResponseNotNull() {
		assertNotNull(st1);
	}*/
	
	/*@Test
	public void testCheckStudentResponseEqual(){
		assertEquals(al,st1);
	}*/

}
