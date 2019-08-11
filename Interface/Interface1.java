interface A
{
 int num=20;
 void show();
 void showMe();               //doubt
}
class B implements A
{
 public void show()
 {
  System.out.println("show B called");
 }
 public void showMe()
 {
  System.out.println("show me called");
  }
}
class C implements A
{
 public void  hello()
 {
  System.out.println("hello is i am");
  }
  public void show()
  {
   System.out.println("show C called");
  }
  /*public void showMe()
 {
  System.out.println("show me C called");
  }*/
}
class Interface1
{
 public static void main(String args[])
 {
  C o=new C();
  o.showMe();
  o.show();
  o.hello();
  }
}