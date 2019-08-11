import static java.lang.System.out;
class Pattern
{
 public static void main(String args[])
 {
   int count = 5;
   for(int i=0;i<count;i++)
   {
    for(int j=0;j<(count-i);j++)
	{
	  out.print("+");
	}
     out.println();
   }	 
 }
}