class Outer
{
 static int out=10;
 static class Inner
 {
  void show()
  {
  System.out.println("static inner class also known as nested class");
  System.out.println(out);
  }
 }
}
class NestedClass
{
 public static void main(String args[])
 {
  Outer.Inner obj=new Outer.Inner();
  obj.show();
  }
}

 