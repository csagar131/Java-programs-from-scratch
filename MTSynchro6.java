class MTSynchro6
{
 public static void main(String args[])
 {
  Shared shared=new Shared();
  A thread1=new A(shared,"one");
  A thread2=new A(shared,"two");
  A thread3=new A(shared,"three");
  A thread4=new A(shared,"four");
  try
  {
   thread1.join();
   thread2.join();
   thread3.join();
   thread4.join();
   }
   catch(InterruptedException e)
   {
   }
 System.out.println("end of program");
 }
}
class A extends Thread
{
 Shared shared;
 public A(Shared shared,String str)
 {
  super(str);
  this.shared=shared;
  System.out.println("================="+this.shared);
  start();
  }
  public void run()
  {
   synchronized(shared)   //can be removed
   {
    shared.doWork(getName());
	}
  }
}
class Shared
{
 //synchronized void doWork(String str) also write
 void doWork(String str)
 {
  System.out.println("starting="+str);
  try
  {
   Thread.sleep((long)(Math.random()*500));
   }
   catch(InterruptedException e)
   {}
    System.out.println("ending="+str);
	
 }
}