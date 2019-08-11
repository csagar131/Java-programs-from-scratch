import java.util.Scanner;
class Room
{
 int length,breadth,height;
 int getVolume()
 {
  return(length*breadth*height);
  }
 Room()
 {
  length=10;
  breadth=20;
  height=30;
  }
  Room(int l,int b,int h)
  {
   length=l;
   breadth=b;
   height=h;
   }
 }
class DemoConstOver
{
 public static void main(String args[])
 {
  int l,b,h,vol1,vol2;
  Scanner sc=new Scanner(System.in);
  System.out.println("enter l,b,h=");
  l=sc.nextInt();
  b=sc.nextInt();
  h=sc.nextInt();
  Room obj1,obj2;
  obj1=new Room();
  obj2=new Room(l,b,h);
  vol1=obj1.getVolume();
  vol2=obj2.getVolume();
  System.out.println("vol1="+vol1);
  System.out.println("vol2="+vol2);
  sc.close();
  }
 }