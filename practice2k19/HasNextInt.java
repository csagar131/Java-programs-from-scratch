import static java.lang.System.out;
import java.util.Scanner;
class HasNextInt
{
 public static void main(String args[])
 {
    Scanner sc = new Scanner(System.in);
	out.println("Enter Integer");
	/*while(sc.hasNextBoolean())       //InputMisMatchException will be occured here
	{
	 int i = sc.nextInt();
	 out.println("i="+i);
	 out.println("enter next Integer");
	 }*/
	int i = 200,j=400;
	while(i++<j--)
	out.println(i+"'''''''"+j);
	
	out.println(i+" "+j);
	
 }
}
	  
	   