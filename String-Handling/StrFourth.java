class StrFourth
{
 public static void main(String args[])
 {
  String s1="java";
  String s2="java";
  String s3=new String("java");
  String s4=new String("JAVA");
  System.out.println(s1==s2);  //true
  System.out.println(s1==s3);  //false
  System.out.println(s3==s4);   //false
  System.out.println(s1.equals(s2)); //true
  System.out.println(s1.equals(s3));  //true
  System.out.println(s1.equals(s4));  //false
  System.out.println(s1.equalsIgnoreCase(s4)); //true
  }
}
  