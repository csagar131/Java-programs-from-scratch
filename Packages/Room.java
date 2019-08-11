package pack2;
import com.mysql.pack1.Class1;
class Dimension extends Class1
{
 double length,breadth,height;
 void setValue(double l,double b,double h)
 {
  length=l;
  breadth=b;
  height=h;
  area();
  volume();
  display();
  }
 void area()
 {
  System.out.println("area is="+(length*breadth));
  }
  void volume()
 {
  System.out.println("volume is"+(length*breadth*height));
  }
}
class Room
{
 public static void main(String args[])
 {
   Dimension d=new Dimension();
   d.setValue(20,30,40);
   }
 }