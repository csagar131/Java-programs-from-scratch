import static java.lang.System.out;
class AutomaticTypeConversion
{
 public static void main(String args[])
 {
   int a = 20;
   if(a=30)    //int  cannot converted to boolean
   out.println("hii");
   else
   out.println("byy");
  }
}
	  
	   