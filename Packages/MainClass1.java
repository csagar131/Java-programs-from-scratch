import govt.in.p1.Demo2;
class Demo3 extends Demo2
{
 int p,q;
 Demo3(int p,int q)
 {
  super(p,q);
  this.p=p;
  this.q=q;
  }
  @Override
  public void show()
 {
  super.show();
  System.out.println(p+q);
  System.out.println("i am show from Demo3");
  }
}
class MainClass1
{
 public static void main(String args[])
 {
  Demo3 d=new Demo3(4,5);
  d.show();
  d.mult();
  }
}