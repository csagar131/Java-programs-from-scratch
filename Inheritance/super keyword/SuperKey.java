class A
{
 A(int a,int b)
 {
   System.out.println("a="+a);
   System.out.println("b="+b);
 }
}
class B extends A
{
 private int z;
 B(int a,int b,int c)
 {
   super(a,b);
   z=c;
   System.out.println("c="+z);
 }
}
class C extends B
{
 C(int a,int b,int c,int d)
 {
  super(a,b,c);
  System.out.println("d="+d);
  }
}
class SuperKey
{
 public static void main(String args[])
 {
  C oc=new C(1,2,3,4);
  }
}
  
   