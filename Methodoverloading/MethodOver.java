import java.util.Scanner;
class Method
{
 void Samename(int a)
 {
  int A=a; 
  System.out.println("       A="+A);
  }
  void Samename(int a,int b)
  {
   int A=a;
   int B=b;
   System.out.println("     A="+A+"          B="+B);
   }
   void Samename(int a,int b,int c)
   {
    int A=a;
	int B=b;
	int C=c;
	System.out.println("  A="+A+"         B="+B+"           C="+C);
	}
}
class MethodOver
{
 public static void main(String args[])
 {
  int a,b,c;
  Scanner sc=new Scanner(System.in);
  Method obj=new Method();
  System.out.println("enter the value of A=");
  a=sc.nextInt();
   System.out.println("enter the value of B=");
  b=sc.nextInt();
   System.out.println("enter the value of C=");
  c=sc.nextInt();
  obj.Samename(a);
   obj.Samename(a,b);
    obj.Samename(a,b,c);
 System.out.println("end of programme");
 }
}
  