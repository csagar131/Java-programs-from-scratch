class Demo1
{
 int a=10;
 }
class UseDemo1 extends Demo1
{
 int a=20;
 void show()
 {
  int a=30;
  System.out.println("value of a="+a);
  System.out.println("value of this.a="+this.a);
  System.out.println("value of super.a="+super.a);
  }
  void showMe()
  {
   System.out.println("a==="+a);
   }
 }
class SuperUse3
{
 public static void main(String args[])
 {
  UseDemo1 obj=new UseDemo1();
  obj.show();
  obj.showMe();
  }
}
  