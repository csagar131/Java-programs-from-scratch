class A
{
 int a;
 A(int i)
 {
  a=i;
  }
  A IncByTen()
  {
   A obj=new A(a+10);
   return obj;
   }
 }
class RetrunObj
{
 public static void main(String args[])
 {
   A obj1=new A(3);
   A obj2=obj1.IncByTen();
   obj2=obj2.IncByTen();
   System.out.println("value of obj1.a="+obj1.a);
   System.out.println("value of obj2.a="+obj2.a);
   }
 }
 