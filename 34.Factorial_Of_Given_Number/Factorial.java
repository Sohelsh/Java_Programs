import java.util.*;

public class Factorial
{
  public static void main(String[] args)
  {
    Scanner Sc = new Scanner(System.in);

    System.out.print("Enter Number = ");
    int No = Sc.nextInt();
    int Fact = 1;
    int Temp = No;

    while(Temp != 0)
    {
      Fact = Fact * Temp;
      Temp--;
    }
    System.out.print("Factorial Is "+ No +" = " +Fact);

}
}