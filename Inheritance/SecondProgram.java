class SuperClass
{
 void show()
 {
  System.out.println("road ahead technology");
  }
}
class SubClass extends SuperClass
{
 void showMe()
 {
  System.out.println("Monopoly in java");
  }
}
class SecondProgram
{
 public static void main(String args[])
 {
  SuperClass obj=new SubClass();
  obj.show();
 // obj.showMe(); 
 /*error object memory to subclass ka h par refer sup ka
   object kr rha to vo subclass k method ko call nahi kr skta*/  
  }                  
}