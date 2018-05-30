import java.util.Scanner;
class IfElse
{
 public static void main(String args[]) throws Exception
 {
  Scanner sm=new Scanner(System.in);
  System.out.println("Enter character");
  char ch=(char)System.in.read();
  if(ch>='a' && ch<='z' || ch>='A' && ch<='Z')
  {
   System.out.println("enter character is a character");
   }
   else
   {
    System.out.println("not a character");
	}
 }
}
  