import java.util.*;
class AList2
{
 public static void main(String args[])
 {
  List<String> aList=new ArrayList<String>(5);
    aList.add("sagar");
	aList.add("suraj");
	aList.add("kishan");
	aList.add("chirag");
	aList.add("rahul");
	aList.add("harsh");
  Iterator<String> itr=aList.iterator();
  while(itr.hasNext())
  {
   String word=itr.next();
   System.out.println("----------->"+word);
  }
  System.out.println("-------------------------------");
    for(int j=aList.size()-1;j>=0;j--)
	{
        String s=aList.get(j);
        if(s.indexOf('a')!=1)
         {
		   aList.remove(j);
         }		 
	}
 Iterator<String> itr1=aList.iterator();
  while(itr1.hasNext())
  {
   String word1=itr1.next();
   System.out.println("----------->"+word1);
  }
 }
}
  
  

  
  