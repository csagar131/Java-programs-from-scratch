class Pattern1
{
 public static void main(String args[])
 {
  int n=5,ns=n-1,s=1;
  for(int i=1;i<=n;i++)
  {
   for(int j=1;j<=ns;j++)
   {
    System.out.print(" ");
	}
	for(int k=1;k<=s;k++)
	{
	 System.out.print(" *");
	 }
	 ns--;
	 s=s+2;
	 System.out.print("\n");
	}
  //pattern 2nd
  int p=4,ps=1,t=7;
  for(int a=1;a<=p;a++)
  {
    for(int b=1;b<=ps;b++)
   {
    System.out.print(" ");
  }
   ps++;
  for(int c=1;c<=t;c++)
  {
   System.out.print(" *");
  }
  t=t-2;
  System.out.print("\n");
  }
 }
}	
  