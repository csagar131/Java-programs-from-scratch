//package govt.in.p1;
class Demo1
{
 int a,b;
 Demo1(int a,int b)
 {
  this.a=a;
  this.b=b;
  }
 int sum()
 {
  return (a+b);
  }
  void show()
  {
   System.out.println("i am show from Demo1 class");
   }
 }
class Demo2 extends Demo1
{
 int a,b;
 Demo2(int a,int b)
 {
 super(a,b);
 this.a=a;
 this.b=b;
 } 
 void mult()
 {
  //super(a,b);   incorrect method cannot call constructor
  System.out.println("mult is ="+(a*b));
  }
 void show()
 {
  super.show();
  System.out.println("i am show from Demo2 class");
  }
}
class MainClass
{
 public static void main(String args[])
 {
  Demo2 d=new Demo2(3,4);
  d.mult();
  d.show();
  int s=d.sum();
  System.out.println("Sum is="+s);
 }
}
  