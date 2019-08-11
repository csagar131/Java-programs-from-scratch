import static java.lang.System.out;
import java.io.*;
class LinearUsingBuffered
{
 public static void main(String args[]) throws IOException
 {
   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   out.println("Enter no. of test cases");
   int t = Integer.parseInt(br.readLine());
   /*
NumberFormatException is an unchecked exception thrown by parseXXX() methods 
when they are unable to format (convert) a string into a number..*/
   StringBuilder sb = new StringBuilder();
   while(t>0)
   {
    out.println("enter size of the arrray");
	int n = Integer.parseInt(br.readLine());
	int arr[] = new int[n];
	
	out.println("enter array element");
	String str = br.readLine();
	String s[] = str.split(" ");
	
	for(int i=0;i<n;i++)
     {
	  arr[i] = Integer.parseInt(s[i]);
	 }
	 
	out.println("enter element to search");
	int x = Integer.parseInt(br.readLine());
	sb.append(linearSearch(arr,x,n)+"\n");
	t--;
   }
   out.println("-----------------------------------");
   out.println(sb);
  }
 static int linearSearch(int arr[],int x,int n)
 {
  for(int i=0;i<n;i++)
  {
   if(arr[i]==x)
   {
    return i;
   }
  }
  return -1;
 }
}