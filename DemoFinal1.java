class A
{
  final int a=10;
 void show()
 {
  System.out.println("value of a:"+a);
  }
}
class B extends A
{
  /*A o=new A();   invalid
  super.a=20;      when same name variable on both class                                             */
  void showMe()
  {
   System.out.println("value of a:"+a);
   }
}
class DemoFinal1
{
 public static void main(String args[])
 {
  B obj=new B();
  obj.show();
//  obj.a=30;    cant change declared as final
  obj.showMe();
  }
}