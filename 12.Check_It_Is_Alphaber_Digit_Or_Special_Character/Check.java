import java.util.*;

public class Check
{
  public static void main(String[] args)
  {
    Scanner Sc = new Scanner(System.in);

    System.out.print("Enter Any Value = ");
    char Ch = Sc.nextLine().charAt(0);

    if((Ch >= 'A') && (Ch <= 'Z') || (Ch >= 'a') && (Ch <= 'z'))
    {
       System.out.print(" This Is Alphabet ");
    }
    else if ((Ch >= '0') && (Ch <= '9'))
    {
       System.out.print(" This Is Digit ");
    }
    else
    {
       System.out.print(" This Is Special Character ");
    }
}
}