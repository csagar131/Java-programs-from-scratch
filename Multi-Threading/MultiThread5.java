class A extends Thread
{
 Thread t;
 A(String str)
 {
  super(str);
  start();
  }
  public void run()
  {
   System.out.println("current thread"+t.currentThread().getName());
   try
   {
    for(int i=0;i<10;i++)
    {
	  sleep(1000);
	  System.out.println(t.currentThread());
	  System.out.println("------------------------------------");
	 }
	}
	catch(InterruptedException e)
	{
	 e.printStackTrace();
	}
  }
}
class MultiThread5
{
 public static void main(String args[])
 {
  A Thread1=new A("//1st thread");
  A Thread2=new A("//2nd thread");
  A Thread3=new A("//3rd thread");
  System.out.println("thread1.isAlive()=="+Thread1.isAlive());
  System.out.println("thread3.isAlive()=="+Thread3.isAlive());
  System.out.println("thread2.isAlive()=="+Thread2.isAlive());
  try
  {
   Thread1.join();   //child thread will finish due to join()
   Thread2.join();   //then after the main method thread will finish executing 
   Thread3.join();
   for(int i=0;i<5;i++)
   {
    long del=(long)(Math.random()*1000);
    Thread.sleep(del);
	System.out.println("delay is================="+del);
	}
   }
   catch(InterruptedException e)
   {
    e.printStackTrace();
	}
  System.out.println("thread1.isAlive()=="+Thread1.isAlive());
  System.out.println("thread3.isAlive()=="+Thread3.isAlive());
  System.out.println("thread2.isAlive()=="+Thread2.isAlive());
  System.out.println("end of program");
  }
}