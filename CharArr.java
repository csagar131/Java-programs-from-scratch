import java.util.Scanner;
class CharArr
{
  public static void main(String args[])
  {
   Scanner sm=new Scanner(System.in);
   System.out.println("enter size");
   int size=sm.nextInt();
   String ch[]=new String[size];
   int len=ch.length;
   System.out.println("entering  array element");
   System.out.println("-------------------------");
   for(int i=0;i<len;i++)
   {
     System.out.println("enter the ["+i+"] element");
	 ch[i]=sm.next();
	 }
	
	for(int i=0;i<len;i++)
   {
     System.out.println("the "+i+"th element is"+ch[i]);
	 }
	}
}
	 
	
    
   