import java.util.*;

public class CalcuSalary
{
  public static void main(String[] args)
  {
    Scanner Sc = new Scanner(System.in);
    
    System.out.print("Enter Salary = ");
    double Salary = Sc.nextInt();
    double da , hra;
   
    if(Salary <= 10000)  
    {
       da  = Salary * 0.8;
       hra = Salary * 0.2;
    }
    else if(Salary <= 20000)
    {
       da  = Salary * 0.9;
       hra = Salary * 0.25;
    }
    else 
    {
       da  = Salary * 0.95;
       hra = Salary * 0.3;
    }
    
    Salary = Salary  + da + hra; 
    
    System.out.print("Gross Salary Is "+ Salary);
}
}
