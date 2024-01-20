import java.util.*;

public class calculator
{
  public static void main(String[] args)
  {
    Scanner Sc = new Scanner(System.in);

    System.out.println(" For Addition press 1");
    System.out.println(" For Subtraction press 2");
    System.out.println(" For Multiplication press 3");
    System.out.println(" For Division press 4");
    System.out.println(" For Modulo press 5");
    
    int Op = Sc.nextInt();

    if(Op == 1)
    {
      System.out.print("Enter First Number = ");
      int No1 = Sc.nextInt();

      System.out.print("Enter Second Number = ");
      int No2 = Sc.nextInt();
      
      System.out.print("Addition Is = "+(No1+No2));
    }
    else if(Op == 2)
    {
      System.out.print("Enter First Number = ");
      int No1 = Sc.nextInt();

      System.out.print("Enter Second Number = ");
      int No2 = Sc.nextInt();
      
      System.out.print("Subtraction Is = "+(No1-No2));
    }
    else if(Op == 3)
    {
      System.out.print("Enter First Number = ");
      int No1 = Sc.nextInt();

      System.out.print("Enter Second Number = ");
      int No2 = Sc.nextInt();
      
      System.out.print("Multiplication Is = "+(No1*No2));
    }
    else if(Op == 4)
    {
      System.out.print("Enter First Number = ");
      int No1 = Sc.nextInt();

      System.out.print("Enter Second Number = ");
      int No2 = Sc.nextInt();
      
      System.out.print("Division Is = "+(No1/No2));
    }
    else if(Op == 5)
    {
      System.out.print("Enter First Number = ");
      int No1 = Sc.nextInt();

      System.out.print("Enter Second Number = ");
      int No2 = Sc.nextInt();
      
      System.out.print("Modulo Is = "+(No1%No2));
    }
    else
    {
     System.out.print(" Choose Correct Option = ");
    }
    
    
}}
    
    
