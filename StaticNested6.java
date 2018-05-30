class Outer
{
 class A
 {
  void show()
  {
   System.out.println("Show Called");
   }
  }
  static class B
  {
   void show()
   {
    System.out.println("Static show called");
	}
  }
  void call()
  {
   System.out.println("outer class method called");
   }
}
class StaticNested6
{
 public static void main(String args[])
 {
  Outer o=new Outer();
  Outer.B obj=new Outer.B();
  obj.show();
  Outer.A obj1=o.new A();
  obj1.show();
  o.call();
  }
}
 