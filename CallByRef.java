class CallBR
{
 int a,b;
 CallBR(int a,int b)
 {
  this.a=a;
  this.b=b;
  }
 void show(CallBR r)
 {
  System.out.println("actual value a="+a+"   b="+b);
  System.out.println("call by ref a="+r.a+"   b="+r.b);
  }
 }
class CallByRef
{
 public static void main(String args[])
 {
  int a,b;
  CallBR obj=new CallBR(10,20);
  CallBR obj1=new CallBR(40,60);
  obj.show(obj1);
  }
 }