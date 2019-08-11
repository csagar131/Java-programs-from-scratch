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
   System.out.println("curent thread"+t.currentThread().getName());
   try
   {
    for(int i=0;i<10;i++)
    {
	  sleep(1000);
	  System.out.println("------------------------------------");
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
class MultiThread4
{
 public static void main(String args[])
 {
  new A("==1st thread");
  new A("==2nd thread");
  new A("==3rd thread");
  try
  {
   for(int i=0;i<5;i++)
   {
    Thread.sleep(500);
	System.out.println("end of program="+i);
	}
   }
   catch(InterruptedException e)
   {
    e.printStackTrace();
	}
  }
}