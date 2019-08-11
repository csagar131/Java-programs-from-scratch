import static java.lang.System.out;
import java.util.Scanner;
class CommandLine
{
 public static void main(String args[])
 {
   int sum=0;
    
   
   for(int i=0;i<args.length;i++)
   {
    sum=sum+Integer.valueOf(args[i]);
	out.println(args[i]);
   }
    out.println(sum);
  
  }
}
	  
	   