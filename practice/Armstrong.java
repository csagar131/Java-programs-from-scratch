import java.util.Scanner;
class Armstrong
{
 public static void main(String args[])
 {
  int a,sum=0;
  /*Scanner sm=new Scanner(System.in);
  System.out.println("enter number");
  int n=sm.nextInt();*/
  int p;
 for(int i=1;i<=1000;i++)
 { 
  p=i;
  while(p>0)
  {
   a=p%10;
   sum=(a*a*a)+sum;
   p=p/10;
   }
  if(sum==i)
   System.out.println(i);
   sum=0;
 }
}
}  