class StringValueOf1
{
 public static void main(String args[])
 {
  char num = 'a';
  String str = String.valueOf(num);  //convert a to String
  String str1 = "";
  str1 =str1+str.toUpperCase();   
  System.out.println(str1);
 }
}
