import java.util.Scanner;
class DemoWhile1
{
 public static void main(String args[])
 {
   Scanner sc=new Scanner(System.in);
   System.out.println("enter the value of i=");
  while(sc.hasNextInt())
  {
   int i=sc.nextInt();
   System.out.println("value of i="+i);
   }
  }
 }