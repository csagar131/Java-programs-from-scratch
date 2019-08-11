import java.util.Scanner;
class PattAdv
{
 public static void main(String args[])
 {
    Scanner sc = new Scanner(System.in);
         int k,n;
		 System.out.println("enter n:");
		 n = sc.nextInt();
		 
         for(int i=0;i<n;i++)
         {
            k=n;
            for(int j=1;j<=((n*n)-(i*n));j++)
            {
                System.out.print(k+" ");
			
                if(j%(n-i)==0)
                {
                 k--;
                }
            }
            System.out.println();
         }
 }
}