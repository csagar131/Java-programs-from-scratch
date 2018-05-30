class Demo
{
 int l,b;
 Demo(int l,int b)
 {
  this.l=l;
  this.b=b;
  }
 void show()
 {
  System.out.println("Area  is="+(l*b));
  }
 }
class DemoThis
{
 public static void main(String args[])
 {
  Demo d=new Demo(10,20);
  d.show();
  }
 }