import java.util.*;

public class Power
{
  public static void main(String args[])
  {
     int Result = 1;

    Scanner sc = new Scanner(System.in);

    System.out.println("Enter Base = ");
    int Base = sc.nextInt();
    
    System.out.println("Enter Power = ");
    int Power = sc.nextInt();

    for(int i = 1;i <= Power;i++)
    {
      Result = Result * Base;
    }

    System.out.println("Anwer Is ="+ Result);
}
}