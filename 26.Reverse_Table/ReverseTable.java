import java.util.*;

public class ReverseTable
{
  public static void main(String[] args)
  {
    Scanner Sc = new Scanner(System.in);

    System.out.print("Enter Start to Table = ");
    int SN = Sc.nextInt();

    System.out.print("Enter End to Table = ");
    int EN = Sc.nextInt();


    for(int i = 10; i >= 1;i--)
    {
      for(int j = SN; j <= EN;j++)
      {
         System.out.print(i*j + " ");
      }
      System.out.println();
    }
}
}