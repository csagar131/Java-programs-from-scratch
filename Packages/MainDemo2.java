package pk.pack3;
import pk.pack2.*;
class MyDemo3 extends AccessMod
{
 void showMeTo()
 {
  showMe();
  show();
  //System.out.println(a);
  System.out.println(b);
  System.out.println(c);
  //System.out.println(d);
  }
}

class MainDemo2
{
 public static void main(String args[])
 {
  MyDemo3 d=new MyDemo3();
  d.showMeTo();
  //d.showMe();    
  //d.show();
 }
}
 