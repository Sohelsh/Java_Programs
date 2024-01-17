import java.util.*;

public class MonthDay
{
  public static void main(String[] args)
  {
    Scanner Sc = new Scanner(System.in);

    System.out.print("Enter Month Number = ");
    int Day = Sc.nextInt();
    
    if(Day == 1)
    {
      System.out.print("January Days =31");
    }
    else if(Day == 2)
    {
      System.out.print("February Days = 28 or 29");
    }
    else if(Day == 3)
    {
      System.out.print("March Days = 31");
    }
    else if(Day == 4)
    {
      System.out.print("April Days = 30");
    }
    else if(Day == 5)
    {
      System.out.print("May Days = 31");
    }
    else if(Day == 6)
    {
      System.out.print("June Days = 30");
    }
    else if(Day == 7)
    {
      System.out.print("July Days = 31");
    }
    else if(Day == 8)
    {
      System.out.print("August Days = 31");
    }
    else if(Day == 9)
    {
      System.out.print("September Days = 30");
    }
    else if(Day == 10)
    {
      System.out.print("October Days = 31");
    }
    else if(Day == 11)
    {
      System.out.print("November Days = 30");
    }
    else if(Day == 12)
    {
      System.out.print("December Days = 31");
    }
    else
    {
      System.out.print("Invalid Input");
    }
    
}
}