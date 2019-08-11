import static java.lang.System.out;
import java.util.Scanner;
class RoundRobin
{
 public static void main(String args[])
 {
   Scanner sc = new Scanner(System.in);
   int i,tbt=0;
   out.println("enter no. of process");
   int n=sc.nextInt();
   out.println("Enter arrival time");
   int at[] = new int[n];
   int bt[] = new int[n];
   for(i=0;i<n;i++)
   {
    at[i]=sc.nextInt();
	}
   out.println("Enter burst time");
   for(i=0;i<n;i++)
   {
    bt[i]=sc.nextInt();
	}
   for(i=0;i<n;i++)
   {
     for(int j=i+1;j<n;j++)
	 {
	  if(at[i]>at[j])
	  {
	   int temp1=at[i];
	   at[i]=at[j];
	   at[j]=temp1;
	   
	   int temp2=bt[i];
	   bt[i]=bt[j];
	   bt[j]=temp2;
	  }
	 }
	}
   out.println("Enter time quatum");
   int tq=sc.nextInt();
   out.println("quest representation");
   for(i=0;i<n;i++)
   {
    out.println("arrrival="+at[i]+"   burst="+bt[i]);
	tbt=tbt+bt[i];
	}
	int a=0,q=0;
	while(a<tbt)
	{
	 for(i=0;i<n;i++)
	 {
	   if(bt[i]>tq)
	   {
	    a=a+tq;
	    bt[i]=bt[i]-tq;
		++q;
		out.println("a="+a);
		out.println("q="+q);
		out.println("bt["+i+"]="+bt[i]);
	   }
	   else
	   {
	     if(bt[i]==0)
		 continue;
		 
 	     a=a+bt[i];
		 ++q;
		 bt[i]=0;
		 out.println("a="+a);
		 out.println("q="+q);
		 out.println("bt["+i+"]="+bt[i]);
	   }
	}
   }
   out.println("total no. in gant chart:"+q);
   out.println("a="+a);
 }
}
	   
    
  
