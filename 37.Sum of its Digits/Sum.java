import java.util.*;

public class Sum
{
  public static void main(String args[])
  {
    int No = 0 ,Dig = 0,Ans = 0;
    Scanner sc = new Scanner(System.in);

    System.out.println("How many digit do ypu want sum = ");
    No = sc.nextInt();
   
    while(No != 0)
    {
      System.out.println("Enter Number = ");
      Dig = sc.nextInt();

      Ans = Ans + Dig;
      No--;     
    } 

    System.out.println("Sum Is = "+ Ans);
}
}