import static java.lang.System.out;
class AutomaticTypeConversion
{
 public static void main(String args[])
 {
  byte b = 10;
  b =(byte) (b + 10);
  out.println(b);
  out.println(5/0.0);
  
  }
}
	  
	   