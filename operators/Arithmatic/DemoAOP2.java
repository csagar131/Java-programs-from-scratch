class DemoAOP2
{
  public static void main(String args[])
 {
   int i=10;
    System.out.println("value of i="+(++i));
   int j=10;
   j++;
   //System.out.println("value of j="+(j++));
   System.out.println("new value j="+j);
 }
} 