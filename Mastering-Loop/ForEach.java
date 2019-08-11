import java.util.Scanner;
class ForEach
{
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("enter size of the array");
  int size=sc.nextInt();
  int arr[]=new int[size];
  System.out.println("enter array element");
  for(int i:arr)
  {
   System.out.print("enter element"+i+"=");
   arr[]=sc.nextInt();
   }
  System.out.println("Array element are");
  for(int a:arr)
  {
   System.out.print(a+" ");
   }
  }
 }