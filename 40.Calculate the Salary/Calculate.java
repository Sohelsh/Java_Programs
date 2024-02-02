import java.util.*;

public class Calculate
{
  public static void main(String args[])
  {
    int No = 0 ,Dig = 0,Ans = 0;
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter Gender= ");
    String Gender = sc.next();

    System.out.println("Enter Year of Service = ");
    int Year = sc.nextInt();
 
    System.out.println("Enter Qualifications= ");
    String Quali = sc.next();

   
    if(Gender == "Male" && Year >= 10 && Quali == "Post-Graduate")
    {
       System.out.println("Your Salary Is = 150000");
    }
    else if(Gender == "Male" && Year < 10 && Quali == "Graduate")
    {
       System.out.println("Your Salary Is = 100000");
    }
    else if(Gender == "Male" && Year >= 10 && Quali == "Post-Graduate")
    {
       System.out.println("Your Salary Is = 80000");
    }
    else if(Gender == "Male" && Year >= 10 && Quali == "Post-Graduate")
    {
       System.out.println("Your Salary Is = 80000");
    }
     
   /// Pendig 

    
}
}