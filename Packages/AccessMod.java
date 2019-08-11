package pk.pack2;
class MyDemo1
{
 int a=5;
 public int b=6;
 protected int c=7;
 private int d=8;
 protected void show()
 {
  System.out.println(a);
  System.out.println(b);
  System.out.println(c);
  System.out.println(d);
  }
}
public class AccessMod extends MyDemo1
{
 protected void showMe()
 {
   System.out.println(a);
   System.out.println(b);
   System.out.println(c);
   //System.out.println(d);
  }
}
 