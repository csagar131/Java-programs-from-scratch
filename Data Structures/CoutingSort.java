import static java.lang.System.out;
import java.util.Scanner;
class CoutingSort
{
 public static void main(String args[])
 {
  Scanner sc = new Scanner(System.in);
  out.println("Enter size of the array");
  int n = sc.nextInt();
  int arr[] = new int[n];
  out.println("Enter array element");
  for(int i=0;i<n;i++)
   arr[i] = sc.nextInt();
  int max,min; 
  max=min=arr[0];
  for(int i=1;i<n;i++)
  { 
   if(arr[i]>max)
   max=arr[i];
   if(arr[i]<min)
   min = arr[i];
  }
  out.println("Max=="+max+"    Min=="+min);
  int c[] = new int[max+1];
  int count=0;
  for(int i=min;i<=max;i++)
  {
   count=0;
   for(int j=0;j<arr.length;j++)
    {
     if(i==arr[j])
	 ++count;
	 else
	 continue;
	}
	c[i] = count;
  }
  out.println("c array");
  for(int i=0;i<c.length;i++)
   out.println(c[i]);
  int k[] = new int[max+1];
  for(int i=0;i<c.length;i++)
  {
   if(i==0)
   k[i]=c[i];
   else
   k[i] = k[i-1]+c[i];
  }
  out.println("k array");
  for(int i=0;i<k.length;i++)
  out.println(k[i]);
  int s[] = new int[arr.length+1];
  int max1=k[k.length-1];
  for(int i=arr.length-1;i>=0;i--)
  {
   --max1;
   for(int j=k.length-1;k>=0;k--)
   {
     if(max1==)
	 s[max
   }
  }  
 }
}