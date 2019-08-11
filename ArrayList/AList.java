import java.util.*;
class AList
{
 public static void main(String args[])
 {
  List<String> aList=new ArrayList<String>(10);
  aList.add("sagar");
  aList.add("dikshant");
  aList.add("suraj");
  aList.add("kishan");
  Iterator<String> itr=aList.iterator();
  while(itr.hasNext())
  {
   String word=itr.next();
   System.out.println("----------->"+word);
  }
 }
}