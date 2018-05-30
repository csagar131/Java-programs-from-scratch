class Demo
{
 int a=10; 
 static int b=20;
}
class DemoStatic3
{
 public static void main(String args[])
 {
  Demo d=new Demo();
  System.out.println("value of non static a="+d.a);
  System.out.println("value of static b="+Demo.b);  //called by there class name
  }
}
  