import java.util.*;

public class Reverse
{
  public static void main(String args[])
  {
    int No = 0,Dig = 0,Rev = 0,Temp = 0;
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter Five Digit Number = ");
    No = sc.nextInt();
    
    Temp = No;
    while(Temp != 0)
    {
      Dig = Temp % 10;
      Temp = Temp / 10;    
      Rev = (Rev*10)+ Dig;
    } 
    
    if(No == Rev)
    {
      System.out.println("original and reversed numbers are equal");
    }
   else  
    {
       System.out.println("original and reversed numbers are not equal");
    }
}
}