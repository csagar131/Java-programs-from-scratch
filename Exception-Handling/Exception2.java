class Exception2
{
 public static void main(String args[])
 {
   int a[]={22,33,44,55,66};
   try
   {
   System.out.println(a[5]);
   }
   catch(ArrayIndexOutOfBoundsException r)
   {
    r.printStackTrace();
	}
   System.out.println("end of program");
  }
}