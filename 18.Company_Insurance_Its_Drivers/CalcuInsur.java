import java.util.*;

public class CalcuInsur
{
  public static void main(String[] args)
  {
    Scanner Sc = new Scanner(System.in);
  
    System.out.print("Enter Married Status = ");
    char Married_Sta = Sc.nextLine().charAt(0);
 
    System.out.print("Enter Gender = ");
    char Gender = Sc.nextLine().charAt(0);

    System.out.print("Enter Age = ");
    int Age = Sc.nextInt();
    
    if(Married_Sta == 'M' || Married_Sta == 'm')
     {
        System.out.print("Total Insurance Is = 10000");
     }
    else if(Married_Sta == 'U' && Gender == 'M' && (Age <= 30) || Married_Sta == 'u' && Gender == 'm' && (Age <= 30))
     {
        System.out.print("Total Insurance Is = 5000");
     }
    else if(Married_Sta == 'U' && Gender == 'F' && (Age <= 25) || Married_Sta == 'u' && Gender == 'f' && (Age <= 25)) 
    {
       System.out.print("Total Insurance Is = 1000");
    }
    else
    {
      System.out.print("Invalid Input");
    }
}
}
        