import java.util.Scanner;
class IfElse1
{
 public static void main(String args[]) throws Exception
 {
  Scanner sm=new Scanner(System.in);
  System.out.println("Enter character");
  char ch=sm.next().charAt(0);                    /*you cannot use String because of
                                                       bad operand (<=)*/
  System.out.println("entered character is="+ch);
  if(ch>='a' && ch<='z' || ch>='A' && ch<='Z')
  {
   System.out.println("it is a character");
   }
   else
   {
    System.out.println("not a character");
	}
 }
}
  