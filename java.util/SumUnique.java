import static java.lang.System.out;
import java.util.*;
class SumUnique
{ 
 
  public static void main(String args[])
  {
    int arr[] = {1,1,1,1,1,1,1,1,1,1},sum=0;
	Set<Integer> set = new HashSet<Integer>();
	for(int i=0;i<arr.length;i++)
	{
	 set.add(arr[i]);
	 }
	Iterator<Integer> itr = set.iterator();
	while(itr.hasNext())
	{
	  sum= sum +itr.next();
	}
	out.println("sum is sum"+sum);
  }
}
