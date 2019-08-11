class DemoBreak1
{
 public static void main(String args[])
 {
  for(int i=0;i<10;i++)
  {
   for(int j=0;j<5;j++)
   {
    System.out.print(i);
	if(i%3!=0)
	break;
	}
	System.out.println();
   }
  }
 }