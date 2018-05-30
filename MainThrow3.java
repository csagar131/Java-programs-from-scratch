import java.util.Scanner;
class DemoMain
{
 int x;
 DemoMain(int x)
 {
  this.x=x;
  }
 void validate()
 {
    if(x<18)
	{
	try
      {
       ArithmeticException e=new ArithmeticException("//invalid ------you aren't eligible");
       throw(e);
      }
	catch(ArithmeticException e)
	{
	 System.out.println("--------------------------"+e.toString());
	 throw(e);
	 }
	}
	else
	{
	  System.out.println("you are eligible");
	}
 }
}
public class MainThrow3
{
 public static void main(String args[])
 {
   Scanner sc=new Scanner(System.in);
  System.out.println("enter age");
  int age=sc.nextInt();
   DemoMain d=new DemoMain(age);
   try
   {
    d.validate();
	}
	catch(ArithmeticException e1)
	{
	 e1.printStackTrace();
	 }
 System.out.println("end of program");
 }
}
 
   
  
	
 