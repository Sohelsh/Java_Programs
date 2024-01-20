import java.util.*;

public class AcceptNumber
{
  public static void main(String[] args)
  {
    Scanner Sc = new Scanner(System.in);

    System.out.print("Enter First Number = ");    
    int No1 = Sc.nextInt();
    
    System.out.print("Enter Second Number = ");    
    int No2 = Sc.nextInt();

    System.out.print("Enter Third Number = ");    
    int No3 = Sc.nextInt();

    if(No1 == No2 && No1 == No3 && No2 == No1 && No2 == No3 && No3 == No1 && No3 == No2)
    {
       System.out.print("All numbers are equal ");
    }
    else
    {
       System.out.print("All numbers are not equal ");
    }

}
}
