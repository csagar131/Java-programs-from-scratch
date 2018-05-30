import java.io.*;
class ThrowsException
{
 public static void main(String args[]) throws IOException
 {
   String str="";
   InputStreamReader isr=new InputStreamReader(System.in);
   BufferedReader br=new BufferedReader(isr);
   System.out.println("enter text");
   while(!str.equals("quit"))
   {
    str=br.readLine();
	System.out.println("your input:"+str);
	}
  }
}
 