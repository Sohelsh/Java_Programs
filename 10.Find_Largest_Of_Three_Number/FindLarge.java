import java.util.*;

public class FindLarge
{
  public static void main(String[] args)
 {
   Scanner Sc = new Scanner(System.in);

   System.out.print("Enter 1st Number = ");
   int No1 = Sc.nextInt(); 

   System.out.print("Enter 2nd Number = ");
   int No2 = Sc.nextInt(); 

   System.out.print("Enter 3rd Number = ");
   int No3 = Sc.nextInt(); 

   if(No1 >= No2 && No1 >= No3)
   {
     System.out.print(" Large Number Is = "+No1);
   }
   else if(No2 >= No1 && No2 >= No3)
   {
     System.out.print(" Large Number Is = "+No2);
   }
   else
   {
     System.out.print(" Large Number Is = "+No3);
   }
}
}
