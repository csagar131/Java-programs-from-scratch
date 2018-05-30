class Outer
{
 int out=10;
 class Inner
 {
  void show()
  {
   System.out.println("not static class also known as inner class");
   System.out.println("can access out="+out);
   }
  }
}
class InnerClass
{
 public static void main(String args[])
 {
  Outer o=new Outer();
  Outer.Inner obj=o.new Inner();
 /* o.out=20;
  System.out.println("value of outer out="+out);*/
  obj.out=30;
  System.out.println("value of outer out from inner class obj="+out);
  
  //o.show();  error cant acces innner class method */
  obj.show();
  }
}