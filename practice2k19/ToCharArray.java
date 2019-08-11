import static java.lang.System.out;

class ToCharArray
{
 static char[] convertToArray(String str)
  {
    char c[] = str.toCharArray();
	return c;
  }
 public static void main(String args[])
 {
  char c[] =convertToArray("sagar");
  for(char a:c)
  out.println(a);
  }
}
  