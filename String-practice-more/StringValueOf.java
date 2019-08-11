class StringValueOf
{
 public static void main(String args[])
 {
  char arr[] = {'a','b','c','d','e'};
  String str=String.valueOf(arr);   //retruns string representation of the array,integer,or anything
  System.out.println(str);                    // if we use Integer.valueOf them return the integer representation
  String str1=str.toUpperCase();   r
  System.out.println(str1);
 }
}
