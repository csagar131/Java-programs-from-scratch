import java.util.Scanner;
class MyException extends Exception
{ 
 MyException(String str)
 {
   super(str);
   System.out.println("MyException class");
   }
}
class UserDefined
{
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("enter value");
  int n=sc.nextInt();
  if(n<5)
  {
   try
   {
    MyException e=new MyException("no is <5");
	throw(e);
	}
	catch(Exception e1)
	{
	 e1.printStackTrace();
	 System.out.println("catch block");
	 }
	}
	else
	{
	 System.out.print("value of n="+n);
	 }
   }
}
	 
  
  