import java.util.*;

public class Table
{
  public static void main(String[] args)
  {
    Scanner Sc = new Scanner(System.in);

    System.out.print("Enter Start to Table = ");
    int SN = Sc.nextInt();

    System.out.print("Enter End to Table = ");
    int EN = Sc.nextInt();


    for(int i = 1; i <= 10;i++)
    {
      for(int j = SN; j <= EN;j++)
      {
         System.out.print(i*j + " ");
      }
      System.out.println();
    }
}
}