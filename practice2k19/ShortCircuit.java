import static java.lang.System.out;
class ShortCircuit
{
 public static void main(String args[])
 {
  int a = 10;
  if((a==20) || ((a=20) == 20))
  out.println("inside if");
  
  out.println("value of a ="+a);
  }
}
	  
	   