package pk.pack1;
class MyDemo1
{
 int a=5;
 public int b=6;
 protected int c=7;
 private int d=8;
 void show()
 {
  System.out.println(a);
  System.out.println(b);
  System.out.println(c);
  System.out.println(d);
  }
}
class MyDemo2 extends MyDemo1
{
 void showMe()
 {
   System.out.println(a);
   System.out.println(b);
   System.out.println(c);
   //System.out.println(d);
  }
}
class DemoMain
{
 public static void main(String args[])
 {
  /*MyDemo1 d1=new MyDemo1();
  d1.show();*/
  MyDemo2 d2=new MyDemo2();
  d2.show();
  d2.showMe();
 }
}    