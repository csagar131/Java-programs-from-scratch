
class DemoWhile2
{
 public static void main(String args[])
 {
  int i=200,j=400;
  while(i++<j--)
  {
   System.out.println(i+"::::::::"+j);    //300-300
   }
   System.out.println("now i="+i+"   "+"j="+j); //301-299
  }
 }
 