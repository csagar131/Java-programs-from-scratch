import java.util.Scanner;
class DemoArr
{
 public static void main(String args[])
 {
   Scanner sm=new Scanner(System.in);
   System.out.println("enter array size");
   int size=sm.nextInt();
   int arr[]=new int[size];
   int len=arr.length;
   System.out.println("entering array elements");
   for(int i=0;i<len;i++)
   {
    System.out.println("enter array element"+i);
	arr[i]=sm.nextInt();
	}
   for(int i=0;i<len;i++)
   {
    System.out.println("array element["+i+"]is"+arr[i]);
	}
  }
 }
 