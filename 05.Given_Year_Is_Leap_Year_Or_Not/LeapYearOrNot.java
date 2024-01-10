import java.util.*;

public class LeapYearOrNot
{
  public static void main(String[] args)
 {
   Scanner Sc = new Scanner(System.in);

   System.out.print("Enter Year = ");
   int Year = Sc.nextInt();

   if((Year % 400 == 0) || ((Year % 4 == 0) && (Year % 100 !=0)))
   {
    System.out.print(Year + " Is leap Year");
   }
   else
   {
    System.out.print(Year + " Not Leap Year");
   }
}
}