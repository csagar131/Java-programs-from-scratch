class StringCopyValueOf
{
 public static void main(String args[])
 {
  char arr[] = {'a','b','c','d','e','f'};
  String str=String.copyValueOf(arr);   //creates String from the character array
  System.out.println(str);
 }
}
