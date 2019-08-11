class CopyValOf
{
 public static void main(String args[])
 {
   //String str="road Ahead Technologies";
   char ch[]={'m','y','l','o','v','e'};
   for(char c:ch)
   {
    System.out.println(c+" ");
   }
   String str=new String(ch);
   System.out.println("Str is:"+str);
   System.out.println("----------------------------");
   String str1=String.copyValueOf(ch);
   System.out.println("Str is:"+str1); 
 }
}
   
   
   