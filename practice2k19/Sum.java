import static java.lang.System.out;
class Demo
{
 int a,b;
}

class Sum
{
 public static void main(String args[])
 {
  Demo d = new Demo();
  out.println(d);
  out.println(d.a);
  out.println(d.b);
  d.a=10;
  d.b=20;
  out.println("---------------sum-------->"+d.a+d.b);
  }
 }
  