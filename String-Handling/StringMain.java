import java.util.Scanner;
class StringMain
{
 public static void main(String args[])throws Exception
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter a String");
  String str="";
  str=sc.nextLine();
  System.out.println("String Entered is:"+str);
  
  String s=new String(str);
  System.out.println("String is:"+s);
 }
}
  
 