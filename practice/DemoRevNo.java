import java.util.Scanner;
class DemoRevNo
{
  public static void main(String args[])
  { 
   int rev=0,a;
   Scanner sc=new Scanner(System.in);
   System.out.println("enter number");
   int n=sc.nextInt();
   while(n>0)
   {
      a=n%10;
	  rev=(rev*10)+a;
	  n=n/10;
	  }
	  System.out.println("reverse is="+rev);
  }
}
    