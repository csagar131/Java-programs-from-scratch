import java.util.Scanner;
class ArrSum
{
 public static void main(String args[])
 {
  int sum=0;
  Scanner sm=new Scanner(System.in);
  System.out.println("enter size");
  int size=sm.nextInt();
  int arr[]=new int[size];
  int len=arr.length;
  System.out.println("length is="+len);
  float avg;
  for(int i=0;i<arr.length;i++)
  {
    System.out.println("enter array"+i+"th");
	arr[i]=sm.nextInt();
   }
  for(int i=0;i<arr.length;i++)
  {
    sum=sum+arr[i];
   }
   avg=sum/len;
System.out.println("sum is="+sum);
System.out.println("avg is="+avg);   
  }
 }
   