class StrFirst
{
 public static void main(String agrs[])
 {
  char c[]={'a','b','c','d','e'};
  byte[] b={65,66,67,68,69};
  String s1=new String(c);
  System.out.println("s1="+s1);
  
  String s2=new String(b);
  System.out.println("s2="+s2);
  
  String s3=new String(c,1,3);
  System.out.println("s3="+s3);  //bcd 
  
  
  String s4=new String(b,2,3);     
  System.out.println("s4="+s4);    //CDE
  }
}
  