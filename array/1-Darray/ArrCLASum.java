import java.util.Scanner;
class ArrCLASum
{
 public static void main(String args[])
 {
  int sum=0;   
  int len=args.length;
 /* for(int i=0;i<len;i++)
  {
   int args[i]=sm.next();
   }*/
  if(len==0)
  System.out.println("No argument is passed");
  else
  {
    for(int i=0;i<len;i++)
   {
    sum=sum+Integer.parseInt(args[i]);
	}
   }

  System.out.println("sum is"+sum);
  }
 }
   
   