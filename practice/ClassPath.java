//package p1;
import java.util.Scanner;
class Hello
{
 double a,b;
 public void setValue(double x,double y)
 {
  a=x;
  b=y;
  }
  public double sum()
  {
   return(a+b);
   }
  public double mult()
   {
    return(a*b);
	}
}
class Other extends Hello
{
 void show()
 {
  double x=sum();
  double m=mult();
  System.out.println("sum is"+x);
  System.out.println("mult is"+m);
  }
}
class ClassPath
{
 public static void main(String args[])
 {
  Other d=new Other();
  d.setValue(20,30);
  d.show();
  }
}
  
  
  
  