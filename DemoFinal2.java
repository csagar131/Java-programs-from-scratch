class Demo1
{
 public static int num=20;
 public final String str="sagar is a programmer";
 }
class Demo extends Demo1
{
 void show()
 {
  System.out.println("num="+num);
  System.out.println("str="+str);
  }
}
class DemoFinal2
{
 public static void main(String args[])
 {
  Demo a=new Demo();
  Demo1.num=30;
  a.num=40;
 // a.str="new string";
  a.show();
  }
}