import java.util.Scanner;
class ArrAdd2D
{
 public static void main(String args[])
 {
  int sum=0;
  Scanner sm=new Scanner(System.in);
  System.out.println("enter row");
  int row=sm.nextInt();
  System.out.println("enter column");
  int col=sm.nextInt();
  int arr[][]=new int[row][col];
  System.out.println("Number of rows="+row+"  cols="+col);
  System.out.println("enter array element");
  for(int i=0;i<row;i++)
  {
   for(int j=0;j<col;j++)
   {
    System.out.print("Enter element["+i+"]["+j+"]:"); 
    arr[i][j]=sm.nextInt();
	System.out.println();
	}
   }
   System.out.println("--------------adding array elements------");
   for(int i=0;i<row;i++)
  {
   for(int j=0;j<col;j++)
   {
    sum=sum+arr[i][j];
	}
  }
  System.out.println("sum is="+sum);
  }
 }
  
