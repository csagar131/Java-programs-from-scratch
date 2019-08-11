class Pattern3
{
 public static void main(String[] args)
 {
  int n=5,p=1;
  for(int i=1;i<=n;i++)
  {
   for(int j=n-1;j>=i;j--)
   {
    System.out.print(" ");
	}
	 System.out.print("*");
	 
	for(int l=1;l<(i-1)*2;l++)
	{
	  System.out.print(" ");
	 }
	 if(i>1)
	 {
	   System.out.print("*");
	   }
	System.out.print("\n");
   }
  }
 }
	  
	 
	  
	 
	  
	  