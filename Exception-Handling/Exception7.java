class Exception7
{
 public static void main(String args[])
 {
   
   try
   {
     Class.forName("com.mysql.jdbc.Driver");
   }
   catch(Exception r)
   {
    r.printStackTrace();
	}
   System.out.println("end of program");
  }
}