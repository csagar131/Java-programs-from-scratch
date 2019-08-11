import p1.Hello;
class Other extends Hello
{
 void show()
 {
  double x=sum();
  double m=mult();
  System.out.println("sum is"+x);
  System.out.println("mult is"+m);
  System.out.println("ho gya");
  
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
  
 
 