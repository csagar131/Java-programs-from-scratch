class CreateArray
{
 public static void main(String args[])
 {
  int a[]=new int[10];
  int len=a.length;
  int sum=0;
  for(int i=0;i<len;i++)
  {
    a[i]=(int)(Math.random()*100);
	sum=sum+a[i];
  }
  for(int c:a)
  {
   System.out.println(c);
   }
 System.out.println("sum is"+sum);
 }
}