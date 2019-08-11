package com.mysql.mypack;
class Dimension
{
 int l,b,h;
 public void getValue(int length,int breadth,int height)
 {
  l=length;
  b=breadth;
  h=height;
  }
  public void area()
  {
   System.out.println("area is="+(l*b));
   }
}
public class Class2 extends Class1
{
 public void volume()
 {
  System.out.println("volume is ="+(l*b*h));
  }
}
