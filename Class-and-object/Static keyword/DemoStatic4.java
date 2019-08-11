class Demo1
{
 int a=10;
 static int b=20;
 }
class DemoStatic4
{
 public static void main(String args[])
 {
  Demo1 d=new Demo1();
  d.a=-2;
  Demo1.b=-2;
  d.b=-3;
  Demo1.b=-4;
  Demo1 d1=new Demo1();
  System.out.println("a="+d1.a);
  System.out.println("b="+d1.b);
  }
}