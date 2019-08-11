interface A
{
 void accept();
 void show();
}
class Student implements A
{
 int roll;
 String name;
 public void accept()
  {
    roll=745;
    name="Sagar";
  }
 public void show()
 {
  System.out.println("Roll="+roll);
  System.out.println("Name="+name);
 }
}
class Teacher implements A
{
 int id;
 String name;
 public void accept()
 {
  name="Ankita";
  id=745;
 }
 public void show()
 {
  System.out.println("id="+id);
  System.out.println("name="+name);
 }
}
class MyMain
{
 public static void main(String args[]) throws Exception
 {
  char ch;
  System.out.println("enter 1 for student and 2 for teacher");
  A IntObj;
  ch=(char)System.in.read();
  if(ch=='1')
  IntObj=new Student();
  else
  IntObj=new Teacher();
 IntObj.accept();
 IntObj.show();
 }
}