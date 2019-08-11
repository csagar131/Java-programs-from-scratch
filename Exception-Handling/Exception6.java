import java.io.*;
class Exception6
{
 public static void main(String args[])throws ClassNotFoundException
 {	
  Class.forName("com.mysql.jdbc.Driver");
  System.out.println("end");
  }
}
  