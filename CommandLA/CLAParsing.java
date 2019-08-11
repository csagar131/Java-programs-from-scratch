class CLAParsing
{
  public static void main(String args[])
   {
      int len=args.length;
	  int sum;
	  System.out.println("array lenght is:"+len);
	  if(len==0)
	  System.out.println("no command line value are passed");
	  else
	  {
	   sum=0;
	    for(int i=0;i<len;i++)
	    {
	     sum=sum+Integer.parseInt(args[i]);
	    }
		System.out.println("sum is:"+sum);
	  }
	  //System.out.println("sum is:"+sum);
   }
}