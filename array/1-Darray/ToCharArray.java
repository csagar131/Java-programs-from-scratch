class PassingArray
{
 char[] convertArray(String str)
 {
  char c[]=str.toCharArray();
  for(char ch:c)
  {
   System.out.println(ch+" ");
   }
  return c;
 }
}

class ToCharArray 
{
 public static void main(String args[])
 {
  String str="sagar";
  PassingArray d=new PassingArray();
  char a[]=d.convertArray(str);
  for(char c:a)
  {
   System.out.println(c);
  }
  System.out.println("end of programme");
 }
}