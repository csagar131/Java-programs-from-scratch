class Pattern2
{
 public static void main(String args[])
 {
  int n=5,s=1;
  for(int i=1;i<=n;i++)
  {
   for(int j=n-1;j>=i;j--)
   {
    System.out.print(" ");
	}
	for(int k=1;k<=i;k++)
	{ 
	 System.out.print(" "+" "+s);
	 }
	 s++;
	 System.out.print("\n");
  }
  //second pyramid
  s=5;
  int p=4;
  for(int a=1;a<=p;a++)
  {
    s--;
   for(int b=1;b<=a;b++)
   {
    System.out.print(" ");
	}
	for(int c=p;c>=a;c--)
	{
	 System.out.print(" "+" "+s);
	 }
	 System.out.print("\n");
  }
 }
}
 