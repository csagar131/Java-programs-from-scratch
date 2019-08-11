import java.util.Scanner;
class SwitchCase
{
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("enter String");
  String p=sc.next();
  String ch=p.toLowerCase();
  switch(ch)
  {
   case "airplane":
   System.out.println("airplane is in demand");
   break;
   case "bus":
   System.out.println("bus in demand");
   break;
   case "train":
   System.out.println("train entered");
   break;
   default:
   System.out.println("default value");
   }
  System.out.println("end of program");
 }
}
  