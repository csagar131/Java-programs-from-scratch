import static java.lang.System.out;
import java.util.*;
import java.security.*;
class SecureRandomClass
{
 public static void main(String args[])
 {
    
    SecureRandom rand = new SecureRandom();
	int i = 1+ rand.nextInt(5);
	out.println(i);
	
 }
}
	  
	   