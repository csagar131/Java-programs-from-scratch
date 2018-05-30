class Demo
{
 private int a,b;
 Demo(int a,int b)
 {
  this.a=a;
  this.b=b;
  }
  int sum()
  {
   System.out.println("sum of a and b="+(a+b));
   return(a+b);
   }
 }
class UseDemo extends Demo
{
 int z;
 UseDemo(int a,int b,int c)
 {
  super(a,b);
  z=c;
  }
  
 void show()
 {
  System.out.println("Sum of all is="+(sum()+z));
  }
}
class SuperUse2
{
 public static void main(String args[])
 {
  UseDemo obj=new UseDemo(2,3,4);
  //obj.sum();
  obj.show();
  }
}