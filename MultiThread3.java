class A extends Thread
{
 @Override
 public void run()
 {
  System.out.println("class A");
  for(int i=0;i<10;i++)
  {
   try
    {
     sleep(2000);
    }
   catch(Exception e)
    {
      e.printStackTrace();
	}
   System.out.println("i====="+i);
   }
  }
}
class B extends Thread
{
  @Override
 public void run()
 {
  System.out.println("class B");
  for(int i=0;i<10;i++)
  {
    try
    {
     sleep(2000);
    }
    catch(InterruptedException e)
    {
      e.printStackTrace();
	}
   System.out.println("j====="+i);
  }
 }
}
class C extends Thread
{
 @Override
 public void run()
 {
  start();
  System.out.println("class C");
  for(int i=0;i<10;i++)
  {
   //System.out.println("class C");
   try
   {
     sleep(2000);
   }
  catch(InterruptedException e)
   {
     e.printStackTrace();
   }
   System.out.println("k====="+i);
  }
 }
}
class MultiThread3
{
 public static void main(String args[])
 {
  A oa=new A();
  B ob=new B();
  C oc=new C();
  oa.start();
  ob.start();
  oc.start();
  }
}
  
