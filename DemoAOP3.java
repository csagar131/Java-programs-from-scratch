class DemoAOP3
{
 public static void main(String args[])
 {
  int x,y;
  x=10;
  /*y=++x;  //x=x+1;    //y=x;
  System.out.println("x="+x);
  System.out.println("y="+y);*/
  y=x++;   //y=x;    //x=x+1;
  System.out.println("x="+x);
  System.out.println("y="+y);
  }
 }
  