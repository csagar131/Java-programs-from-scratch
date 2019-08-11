class Figure
{
 int l,b,area;
 int areaCalc()
 {
  area=l*b;
  return area;
 }
}
class Rectangle extends Figure
{ 
 Rectangle(int len,int bre)
 {
  l=len;
  b=bre;
 }
}
class Square extends Figure
{
 Square(int len)
 {
  l=len;
  b=len;
 }
}
class Inheritance
{
 public static void main(String args[])
 {
 Rectangle r=new Rectangle(3,4);
 int p=r.areaCalc();
 System.out.println("p="+p);

 Square s=new Square(3);
 int q=s.areaCalc();
 System.out.println("q="+q);
 }
} 