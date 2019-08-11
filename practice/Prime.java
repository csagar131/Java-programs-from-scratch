class Prime 
{
 public static void main(String args[])
 {
   int n=7,f;
   for(int i=2;i<=(n/2);i++)
   {
      if(n%i!=0)
	  {
	   f=1;
	   }
   }
   if(f==1)
   {
    System.out.println("number is prime");
   }
  }
}