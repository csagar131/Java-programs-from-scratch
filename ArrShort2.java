import java.util.Scanner
class ArrSort2
{
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("enter size of array:);
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
   System.out.println("array element at"+i+"is:="+arr[i]);
   }
  }
 }
   
  
  