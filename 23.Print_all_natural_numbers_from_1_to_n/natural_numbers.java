import java.util.*;

public class natural_numbers
{
  public static void main(String[] args)
  {
    Scanner Sc = new Scanner(System.in);

    System.out.println("Enter what you want 1 to n = ");
    int N = Sc.nextInt();
    int i = 1;

    while(i <= N)
    {
      System.out.print(" "+i);
     i++;
    }
}
}