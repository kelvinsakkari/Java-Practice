package com.socket.server;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class MyServer {
    
    public static void main(String args[])throws Exception{  
    ServerSocket ss=new ServerSocket(3333); //create a new socket  
    Socket s=ss.accept();  //listen if any connection request is coming at the socket, if coming accept it
    DataInputStream din=new DataInputStream(s.getInputStream());  //make input stream of the socket as data input stream
    DataOutputStream dout=new DataOutputStream(s.getOutputStream());  //make output stream of the socket as data output stream
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  
      
    String str="",str2="";  
    while(!str.equals("stop")){  //continue the loop until 'stop' word is entered
    str=din.readUTF();  //read the in stream as UTF-8 encoded stream
    System.out.println("client says: "+str);  
    str2=br.readLine();  
    dout.writeUTF(str2);  //write to the out stream as UTF-8 encoded stream  
    dout.flush();  
    }  
    din.close();  
    s.close();  
    ss.close();  
    }
  }  


