import java.util.Scanner;
class DemoI
{
 int a,b,c=5;
 void getValue(int a)
 {
  this.a=a;
  }
  void show()
  {
   System.out.println("a="+a);
   System.out.println("b="+b);
   }
 { 
   System.out.println("initialization block is getting executed");
   b=c+10;
   }
 }
class DemoInBlock
{ 
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  int s;
  System.out.print("enter the value of a=");
  s=sc.nextInt();
  DemoI d=new DemoI();
  d.getValue(s);
  d.show();
 }
}