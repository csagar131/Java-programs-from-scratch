import java.util.Scanner;
class Exception1
{
  public static void main(String args[])
  {
   Scanner sc=new Scanner(System.in);
   int i,n=0;
   System.out.println("enter any number");
   i=sc.nextInt();
   try
   {
    n=10/i;
	}
	catch(ArithmeticException e)
	{
	 System.out.println("we are in catch block\n "+e);
	 System.out.println("--------------------------------");
	 //System.out.println(e);     same printeds
	 e.printStackTrace();
	 }
   System.out.println("End of Program");
   System.out.println("n="+n);
   }
}
   