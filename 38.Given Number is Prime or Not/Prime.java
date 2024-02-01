import java.util.*;

public class Prime
{
  public static void main(String args[])
  {
    int j = 0, i = 0;
    Scanner sc = new Scanner(System.in);

    //System.out.println("Enter Number = ");
    //No = sc.nextInt();

    for(j = 1;j <= 100; j++)
   {
    for(i = 2;i <= j;i++)
    {
      if(j % i == 0)
      {
        break;
      }
    }
    if(i == j)
    {
      System.out.println(j);
    } 
}
 }
}