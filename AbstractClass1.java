abstract class Demoo
{
 abstract void bookMatter();
 final void pubName()
 {
  System.out.println("written by sagar");
  }
}
class Demu extends Demoo
{
 void bookMatter()
 {
  System.out.println("c is structured lang");
  }
}
class Demuu extends Demu
{
 @Override
 void bookMatter()
 {
 System.out.println("java is platform independent");
 }
}
class AbstractClass1
{
 public static void main(String args[])
 {
  Demuu o=new Demuu();
  o.bookMatter();
  o.pubName();
  Demu oo=new Demu();
  oo.bookMatter();
  oo.pubName();
 }
}
  
  
 