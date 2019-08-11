import java.util.Scanner;
class Demo
{
  int a,b;
  void getValue(int a,int b)
  {
   this.a=a;
   this.b=b;
   }
  void showValue()
  {
    System.out.println("a="+a+",b="+b);
  }
}
class ClassnObj
{
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  int a,b;
  Demo d=new Demo();
  System.out.println("enter the value of a and b");
  a=sc.nextInt();
  b=sc.nextInt();
  d.getValue(a,b);
  d.showValue();
 }
}
  
  