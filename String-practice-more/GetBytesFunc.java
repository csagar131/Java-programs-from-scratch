class GetBytesFunc
{
 public static void main(String args[])
 {
   String str = "hellofriendschaipeelo";
   byte bt[] = str.getBytes();
   for(byte b: bt)
   {
     System.out.println(b);
   }
 }
}
