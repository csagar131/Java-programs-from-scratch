class DemoAOP1
{
 public static void main(String args[])
 {
  System.out.println("1=" +(5/2));
  System.out.println("2="+(5/2.0));
  System.out.println("3="+(5.0/2));
  System.out.println("4="+(5.0/2.0));
  
   double d=5/2;
   System.out.println("6="+d);
   System.out.println("7="+(0/10));
   System.out.println("8="+(0.0/0.0));
   System.out.println("9="+(5/0.0));
   System.out.println("10="+(5/0));
  }
 }