import java.util.Scanner;
class ArrSort2
{
 public static void main(String args[])
 {
  int min,temp;
  Scanner sc=new Scanner(System.in);
  System.out.println("enter size of array:");
  int size=sc.nextInt();
  int arr[]=new int[size];
  for(int i=0;i<arr.length;i++)
  {
   System.out.println("Enter array element"+i+":=");
   arr[i]=sc.nextInt();
   }
   System.out.println("Array elements are----");
   for(int i=0;i<arr.length;i++)
  {
   System.out.print(arr[i]+" ");
   }
   min=arr[0];
   for(int i=1;i<arr.length;i++)
   {
    if(min>arr[i])
	{
	  min=arr[i];
	  arr[i]=arr[i-1];
	  arr[i-1]=min;
	  }
	 }
	System.out.println("Sorted array is------");
	for(int i=0;i<arr.length;i++)
   {
   System.out.print(arr[i]+" ");
   }
  }
 }
   
  
  