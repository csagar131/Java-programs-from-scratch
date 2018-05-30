class Demo
{
 Demo(int a,int b)
 {
  this(a);
  System.out.println("   a="+a+"    b="+b);
  }
 Demo(int a)
 { 
   System.out.println("a="+a);
 }
 Demo(int a,int b,int c)
 {
  this(a,b);
  System.out.println("a="+a+"    b="+b+"   c="+c);
 }
}
class ThisCallConst
{
 public static void main(String args[])
 {
    new Demo(1,2,3);
  }
}  