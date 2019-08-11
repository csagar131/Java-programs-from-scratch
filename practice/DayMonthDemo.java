class DayMonthDemo
{
 public static void main(String args[])
 {
  int num=Integer.parseInt(args[0]);  //string converted to integer
  int day=num%30;
  int month=num/30;
  System.out.println("month="+month+"   "+"days="+day);
  }
}
 