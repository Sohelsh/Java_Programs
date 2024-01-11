import java.util.*;

public class Eligible
{
  public static void main(String[] args)
  {
    Scanner Sc = new Scanner(System.in);

    System.out.print("Enter Age = ");
    int Age = Sc.nextInt();

    if(Age >= 18)
   {
     System.out.print("Candidate Eligible For Voting");
   }
   else
   {
     System.out.print("Candidate Not Eligible For Voting");
   }
}
}