class Shared
{
  int data=0;
  synchronized public void read()
  {
   try
   {
   wait();
   }
   catch(InterruptedException e)
   {
    e.printStackTrace();
   }  
   System.out.println("result="+data);
  }
  synchronized public void write()
  {
   notify();
   data=1;
  }
}
class ReadThread extends Thread
{
 Shared sh;
 public ReadThread(Shared sh)
 {
  this.sh=sh;
  start();
  }
 public void run()
 {
  sh.read();
  }
}
class WriteThread extends Thread
{
 Shared sh;
 public WriteThread(Shared sh)
 {
  this.sh=sh;
  start();
  }
  public void run()
  {
   sh.write();
   }
}
class InterThreadComm
{
 public static void main(String args[])
 {
  Shared shared=new Shared();
  ReadThread r=new ReadThread(shared);
  WriteThread w=new WriteThread(shared);
  }
}