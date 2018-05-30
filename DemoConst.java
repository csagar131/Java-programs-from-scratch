import java.util.Scanner;
class Const
{
 int a,b;
 void Sum()
 {
  System.out.println("Sum is="+(a+b));
  }
  Const(int x,int y)
  {
   a=x;
   b=y;
   System.out.println("   A="+a+"   B="+b);
   Sum();
  }
 }
class DemoConst
{
 public static void main(String args[])
 {
  int c;
  Scanner sc=new Scanner(System.in);
  System.out.println("enter a & b=");
  int a=sc.nextInt();
  int b=sc.nextInt();
  Const c1=new Const(a,b);
  System.out.println("end of Program");
 }
}