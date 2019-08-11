import java.util.Scanner;
class Exception4
{
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  int n=0,i;
  System.out.println("enter value of i=");
  i=sc.nextInt();
  try
  {
    n=47;
   }
   catch(ArithmeticException e)
   {
     e.printStackTrace();
	}
  finally
  {
   System.out.println("n="+(char)n);
 System.out.println("end of program");
   } 
  }
}