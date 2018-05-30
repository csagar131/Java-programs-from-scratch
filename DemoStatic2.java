class DemoS
{
 static int a=5;
 static void show()
 {
  System.out.println("using static method a="+a); 
  /*static method call only call static
  method and static data not the non static method*/
	show1();    //non static method can call static variable
}
 static void show1()
 {
  System.out.println("a="+a);
  }
 }
class DemoStatic2
{
 public static void main(String args[])
 {
  DemoS s=new DemoS();
  DemoS.show();
  }
 }