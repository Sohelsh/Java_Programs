import java.util.*;

public class CalcuElectricity
{
  public static void main(String[] args)
  {
    Scanner Sc = new Scanner(System.in);
    
     System.out.print("Enter Unit = ");
      double Unit = Sc.nextDouble();
     
     if(Unit <=50)
     { 
       Unit = (Unit * 0.50)+ 0.2;
     }
     else if(Unit <= 150)
     {
       Unit = (Unit * 0.75)+ 0.2;
     }
      else if(Unit <= 250)
     {
       Unit = (Unit * 1.20)+ 0.2;
     }
     else
     {
        Unit = (Unit * 1.50)+ 0.2;
     }
   
   System.out.print("Total Bill Is = " + Unit);
}
}
    