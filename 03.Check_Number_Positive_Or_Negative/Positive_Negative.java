import java.util.*;

public class Positive_Negative
{

 public static void main(String[] args)
 {
	
    Scanner Sc = new Scanner(System.in);
    
    System.out.print("Enter Number = ");
    int No = Sc.nextInt();

    if(No > 0)
    {
	System.out.println("Number Is Positive");
    }
    else
    {
       System.out.println("Number Is Negative");
    }


 }


}