package SimpleInterest;

import java.sql.*;  
class Jdbc{  
public static void main(String args[]){  
try{  
Class.forName("com.mysql.jdbc.Driver");  
  
Connection con=DriverManager.getConnection(  
"jdbc:mysql://localhost:3306/kelvin","root","hagrid123");  
  
//here kelvin is database name, root is username and hagrid123 password  
  
Statement stmt=con.createStatement(); 

  
ResultSet rs=stmt.executeQuery("select * from emp");  
  
while(rs.next())  
System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));  
  
con.close();  
  
}catch(Exception e){ System.out.println(e);}  
  
}  
}  