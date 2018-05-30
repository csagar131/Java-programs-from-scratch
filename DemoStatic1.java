class DemoS
{
 static int s=10;
 }
class DemoStatic1 
{
 public static void main(String args[])
 {
  DemoS s=new DemoS();
  System.out.println("access static using class name"+DemoS.s);
  System.out.println("access static using obj name"+s.s);
 }
}