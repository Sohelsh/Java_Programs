import java.util.*;

public class Reverse
{
  public static void main(String args[])
  {
     int No = 0 , Temp = 0 , Dig = 0 ,Rev = 0;

    Scanner sc = new Scanner(System.in);

    System.out.println("Enter Number = ");
    No = sc.nextInt();
    
    Temp = No;
   
    while(Temp != 0)
    {
      Dig = Temp % 10;
      Temp = Temp / 10;
      Rev = (Rev*10) + Dig;
    } 

    System.out.println("Given Number Is ="+ No);
    System.out.println("Reverse Number Is ="+ Rev);    
}
}