class LeapYear1
{
    public static void main(String[] args)
     {
          int year=2016;
        if((year%400==0) || (year%4==0 && year%100!=0))
           {
             System.out.println(year+" is a Leap Year ");
           }
    else
            {
              System.out.println(year+" is Not a Leap Year ");
            }
     }
}