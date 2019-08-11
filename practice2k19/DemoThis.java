import static java.lang.System.out;

class Calc
{
  Calc()
  {
   out.println(this);
  }
}
class DemoThis
{
 public static void main(String args[])
 {
  Calc c1 = new Calc();
  out.println(c1);
  out.println("--------------------------");
  Calc c2 = new Calc();
  
  out.println(c2);
 }
}