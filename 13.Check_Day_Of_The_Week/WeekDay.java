import java.util.*;

public class WeekDay
{
  public static void main(String[] args)
  {
    Scanner Sc = new Scanner(System.in);

    System.out.print("Enter Week of Day = ");
    int Day = Sc.nextInt();
    
    if(Day == 1)
    {
      System.out.print("Monday");
    }
    else if(Day == 2)
    {
      System.out.print("Tuesday");
    }
    else if(Day == 3)
    {
      System.out.print("Wednesday");
    }
    else if(Day == 4)
    {
      System.out.print("Thruesday");
    }
    else if(Day == 5)
    {
      System.out.print("Friday");
    }
    else if(Day == 6)
    {
      System.out.print("Saturday");
    }
    else if(Day == 7)
    {
      System.out.print("Sunday");
    }
    else
    {
      System.out.print("Invalid Input");
    }
    
}
}