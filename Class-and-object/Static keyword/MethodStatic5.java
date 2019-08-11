class DemoStatic
{
 void showMe()
 {
  System.out.println("hello");
  }
 static void show()
  {
    DemoStatic d=new DemoStatic();
    d.showMe();
   }
 }
class MethodStatic5
{
 public static void main(String args[])
 {
  DemoStatic d=new DemoStatic();
  d.show();
  }
}