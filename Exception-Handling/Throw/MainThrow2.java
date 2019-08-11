public class MainThrow2
{
  public static void validate(int age)
  {
   if(age<18)
   throw new ArithmeticException("invalide");
   else
   System.out.println("you are eligible");
   }
  public static void main(String args[])
  {
    validate(17);
	catch(ArithmeticException e)
	{
	 e.printStackTrace();
	 }
  }
}
   
   