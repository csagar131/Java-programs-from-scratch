class DemoContinue1
{
 public static void main(String args[])
 {
  a:
  for(int i=0;i<10;i++)
  {
   for(int j=0;j<5;j++)
   {
     System.out.print(i);
	 if(i%3!=0)
	 continue a;
	 System.out.print("*");
	}
   System.out.println();	
   }
 }
}