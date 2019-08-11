abstract class DemoAb
{
 abstract void show();
 abstract void sum(int a,int b);
 abstract void sqrt(double a);
}
abstract class DemoA extends DemoAb
{
 @Override
 void show()
 {
  System.out.println("thats  me show");
  }
 @Override
 void sum(int a,int b)
 {
  System.out.println("sum is="+(a+b));
  }
}
class Demo extends DemoA
{
 @Override
 void sqrt(double a)
 {
  System.out.println("Square is="+Math.sqrt(a));
  }
}
class AbstractClass
{
 public static void main(String args[])
 {
  Demo o=new Demo();
  o.show();
  o.sum(10,20);
  o.sqrt(25);
  }
}
  
  
 