class DemoSI
{
 static int a=5,b;
 static 
 {
  System.out.println("static block called");
  b=a*10;
  }
  static void show()
 {
  System.out.println("a="+a+"and b="+b);
  }
  static void s()
  {
   System.out.println("hello");   
  }
 }
class DemoStaticIBlock
{
 public static void main(String args[])
 {
 DemoSI.show();
 DemoSI d=new DemoSI();
 d.show();
 s();   //detected error ask
 }
}
 