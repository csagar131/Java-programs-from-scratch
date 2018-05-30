class A
{
 int l,b;
  A(int l,int b)
 {
  this.l=l;
  this.b=b;
  }
}
class B extends A
{
 B()
 {
  super(10,20);
  }
  void show()
   {
    System.out.println("value of l and b="+l+"  "+b);
	}
 }
class SuperUse
{
 public static void main(String args[])
 {
  B obj=new B();
  obj.show();
  }
}