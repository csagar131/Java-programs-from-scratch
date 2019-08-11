import java.util.Scanner;
interface Common
{
 void accept();
 void display();
}
class Student implements Common
{
 Scanner sc=new Scanner(System.in);
 int rollno,age;
 String name;
 public void accept()
 {
  System.out.println("enter name");
  name=sc.next();
  System.out.println("enter roll no.");
  rollno=sc.nextInt();
  System.out.println("enter age");
  age=sc.nextInt();
  }
  public void display()
  {
   System.out.println("Student details-----------");
   System.out.println("name="+name);
   System.out.println("rollno="+rollno);
   System.out.println("age="+age);
   }
}
class Customer implements Common
{
 Scanner sc=new Scanner(System.in);
 int cid,cage;
 String cname;
 public void accept()
 {
  System.out.println("enter custname");
  cname=sc.next();
  System.out.println("enter cid");
  cid=sc.nextInt();
  System.out.println("enter custage");
  cage=sc.nextInt();
  }
  public void display()
  {
   System.out.println("Customer details-----------");
   System.out.println("name="+cname);
   System.out.println("cid="+cid);
   System.out.println("age="+cage);
   }
}
class InterfaceMain2
{
 public static void main(String args[]) throws Exception
 {
  Scanner sc=new Scanner(System.in);
  char ch;
  Common r;
  System.out.println("enter 1 for student 2 for customer");
  ch=(char)System.in.read();
  if(ch=='1')
  {
  r=new Student();
  }
  else
  {
  r=new Customer();
  }
  r.accept();
  r.display();
  }
} 