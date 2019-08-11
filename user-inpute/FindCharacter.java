import java.util.Scanner;
class FindCharacter
{
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  char ch;
  ch=sc.next().charAt(0);
  if(ch>='a' && ch<='z')
  {
    System.out.println("character entered is alphabet");
  }
  else
  {
  System.out.println("not an alphabet");
  }
 }
}