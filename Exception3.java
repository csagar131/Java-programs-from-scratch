import java.util.Scanner;
class Exception3
{
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  int a[]={22,33,44,55,66};
  int n=0,i;
  System.out.println("enter value of i=");
  i=sc.nextInt();
  try
  { System.out.println("in try block");
	n=a[3]/i;
	System.out.println("i="+i);
	System.out.println(a[i]);
   }
   catch(ArrayIndexOutOfBoundsException e)
   {
    System.out.println(e.toString());
   }
   catch(ArithmeticException e)
   {
     System.out.println(e.toString());
	}
   System.out.println("n="+n);
 System.out.println("end of program"); 
  }
}