package p2;
import com.mysql.mypack.Class2;
class Class3 extends Class2
{
  void show()
  { 
   getValue(2,3,4);
   area();
   volume();
  }
}
public class MainClass
{
 public static void main(String args[])
 {
  Class3 o=new Class3();
  o.show();
  }
}
 