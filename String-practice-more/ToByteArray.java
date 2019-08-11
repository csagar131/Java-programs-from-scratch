class ToByteArray
{
 public static void main(String args[])
 {
   String str = "hellofriendschaipeelo";
   int bt[] = str.toByteArray();
   for(int b: bt)
   {
     System.out.println(b);     
   }
 }
}
