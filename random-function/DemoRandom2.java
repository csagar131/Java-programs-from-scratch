class DemoRandom2
{
 public static void main(String args[])
 {
  int a=(int)(Math.random()*5);
    int b=(int)(Math.random()*5);
	  int c=(int)(Math.random()*5);
	  System.out.println(a+","+b+","+c);
	 int result=(a>b)?((a>c)?a:c):((b>c)?b:c);
  System.out.println(result);
  }
 }