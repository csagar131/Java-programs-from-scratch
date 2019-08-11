class Prime1To1000
{
 public static void main(String args[])
 {
  int flag=1;
  for(int i=2;i<=1000;i++)
  {
   for(int j=2;j<=(i/2);j++)
   {
    if(i%j==0)
	{ 
	  flag=0;
	 }
	}
    if(flag==1)
	 System.out.println(i);
     flag=1;
  }
 }
}
	 
	  
	  
	 