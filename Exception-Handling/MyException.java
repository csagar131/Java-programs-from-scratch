class UserDefinedEx extends Exception
{ 
  UserDefinedEx(String str)
  { 
   super(str);
  }
}
class MyException
{
 public static void main(String args[])
 {
 int a=(int)(Math.random()*10);
 int arr[]=new int[a];
 System.out.println("Value of a="+a);
 try
 {
  if(a<5)
  {
   UserDefinedEx d=new UserDefinedEx("a<5");
   throw(d);
  }
 }
 catch(UserDefinedEx e1)
 {
  e1.printStackTrace();
  }
 System.out.println("end of program");
 }
} 
  
 