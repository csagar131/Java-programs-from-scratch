import java.util.Scanner;
class OneClass
{
 int length,breadth;
 void getValue(int l,int b)
 {
  length=l;
  breadth=b;
  }
}
class SecondClass extends OneClass
{
 void show()
 {
  System.out.println("area is="+(length*breadth));
  }
}
class FirstProgram
{
 public static void main(String args[])
 {
  SecondClass obj=new SecondClass();
  obj.getValue(4,5);
  obj.show();
  }
}
 