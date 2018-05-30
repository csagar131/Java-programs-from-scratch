import java.util.Scanner;
class ArrShort
{
 public static void main(String args[])
 {
   int temp;
  Scanner sm=new Scanner(System.in);
  System.out.println("array size please enter yarr");
  int size=sm.nextInt();
  int arr[]=new int[size];
  int len=arr.length;
  System.out.println("array size="+size);
  for(int i=0;i<len;i++)
  { 
   arr[i]=(int)(Math.random()*100);
   }
   System.out.println("array elements are");
   for(int i=0;i<len;i++)
   {
    System.out.print(arr[i]+" ");
	}
System.out.println("\nwait for sorted array");
for(int i=0;i<len;i++)
{
 for(int j=i+1;j<len;j++)
 {
  if(arr[i]>arr[j])
  {
   temp=arr[i];
   arr[i]=arr[j];
   arr[j]=temp;
   }
  }
 }
 System.out.print("sorted array is ");
 for(int i=0;i<len;i++)
 {
  System.out.print(arr[i]+" ");
  }
  sm.close();
  }
 }
    