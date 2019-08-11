class DemoThrow1
{
 //ArithmeticException e=new ArithmeticException();
 void show()
 {
 ArithmeticException e=new ArithmeticException();
 try
 {
  throw(e);
  }
  catch(ArithmeticException e1)
  {
    //e1.printStackTrace();
	System.out.println("caught");
	throw(e1);
  }
 }
}
class MainThrow1
{
 public static void main(String args[])
 {
 DemoThrow1 d=new DemoThrow1();
 try
 {
 d.show();
 }
 catch(Exception e)
 {
  System.out.println("------------------------------------");
  e.printStackTrace();
  System.out.println("------------------------------------");
 }
}
}
  
 