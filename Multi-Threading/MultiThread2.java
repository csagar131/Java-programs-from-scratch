class A extends Thread
{
 public void run()
 {
  System.out.println("class A");
  for(int i=0;i<10;i++)
  {
   System.out.println("i====="+i);
   }
  }
}
class B extends Thread
{
 public void run()
 {
  System.out.println("class B");
  for(int i=0;i<10;i++)
  {
   System.out.println("j====="+i);
   }
  }
}
class C extends Thread
{
 public void run()
 {
  System.out.println("class C");
  for(int i=0;i<10;i++)
  {
   //System.out.println("class C");
   System.out.println("k====="+i);
   }
  }
}
class MultiThread2
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
  
