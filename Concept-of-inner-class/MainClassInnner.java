class StaticOut
{
  int out=5;
  class InnerClass
 {
   void show()
   {
	System.out.println("hello from inner class");
	System.out.println("outer out value="+out);
	}
 }
}

class MainClassInnner
{
 public static void main(String args[])
 {
  StaticOut o=new StaticOut();
  StaticOut.InnerClass obj=o.new InnerClass();
  obj.show();
  }
}
	