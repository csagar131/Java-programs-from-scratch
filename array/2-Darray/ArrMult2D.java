import java.util.Scanner;
class ArrMult2D
{
 public static void main(String args[])
 {
  int sum;
  Scanner sm=new Scanner(System.in);
  System.out.println("enter row");
  int row=sm.nextInt();
  System.out.println("enter column");
  int col=sm.nextInt();
  int arr1[][]=new int[row][col];
  int arr2[][]=new int[row][col];
  int arr3[][]=new int[row][col];
  System.out.println("Number of rows="+row+"  cols="+col);
  System.out.println("enter array1 element");
  for(int i=0;i<row;i++)
  {
   for(int j=0;j<col;j++)
   {
    System.out.print("Enter element["+i+"]["+j+"]:"); 
    arr1[i][j]=sm.nextInt();
	System.out.println();
	}
   }
   System.out.println("enter array2 element");
   for(int i=0;i<row;i++)
  {
   for(int j=0;j<col;j++)
   {
    System.out.print("Enter element["+i+"]["+j+"]:"); 
    arr2[i][j]=sm.nextInt();
	}
   }
   System.out.println("1st array element are");
   for(int i=0;i<row;i++)
  {
    System.out.println();
   for(int j=0;j<col;j++)
   {
    System.out.print(arr1[i][j]+" "); 
	}
   }
   System.out.println("\n2nd array element are");
   for(int i=0;i<row;i++)
  {
    System.out.println();
   for(int j=0;j<col;j++)
   {
    System.out.print(arr2[i][j]+" "); 
	}
   }
   System.out.println("\n--------------multiplying array elements------");
   for(int i=0;i<row;i++)
   {
   for(int j=0;j<col;j++)
    {
	 sum=0;
	 for(int k=0;k<col;k++)
	 {
	  sum=sum+(arr1[i][k]*arr2[k][j]);
	  arr3[i][j]=sum;
	  }
	}
   }
   System.out.println("------->multiplied array is here<--------");
   for(int i=0;i<row;i++)
  {
    System.out.println();
   for(int j=0;j<col;j++)
   {
    System.out.print(arr3[i][j]+" "); 
	}
   }
   System.out.println("\nthank you");
  }
 }
  
