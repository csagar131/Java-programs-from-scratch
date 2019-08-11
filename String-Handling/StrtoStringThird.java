class Demo
{
 public String toString()
 {
   return "you have overridden toString()";
 }
}
class StrtoStringThird
{
 public static void main(String args[])
 {
  Demo d=new Demo();
  System.out.println(d);
 }
}
  
