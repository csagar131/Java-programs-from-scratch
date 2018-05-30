import java.util.Scanner;
class Hello
{
 double a,b;
 void SetValue(double x,double y)
 {
  a=x;
  b=y;
  }
  double Sum()
  {
   return(a+b);
   }
   double Mult()
   {
    return(a*b);
	}
}
class DoubleSumM
{
 public static void main(String args[])
 {
  double p,q,r,s;
  Scanner sm=new Scanner(System.in);
  Hello h=new Hello();
  System.out.print("enter value of A=");
  p=sm.nextDouble();
  System.out.print("enter value of B=");
  q=sm.nextDouble();
  h.SetValue(p,q);
  r=h.Sum();
  System.out.println("Sum is="+r);
  s=h.Mult();
  System.out.println("Mult is="+s);
  }
 }
  
  
  
  