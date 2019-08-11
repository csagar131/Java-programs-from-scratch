import java.util.Scanner;
public class PrimeNo
{
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  int i;
  System.out.println("enter number");
  int no=sc.nextInt();
  if(no==1)
  {
   System.out.println("min prime number is=2");
   }
   for(i=2;i<no;i++)    //i becomes 7 here
   {
    if(no%i==0)             // at last loop i==6 so if doesnt execute
	{
	 System.out.println("not prime");
	 break;
	 }
	}
 System.out.println("i=="+i);	
  if(no==i)
  {
  System.out.println("no. is prime");
  }
 }
}

   