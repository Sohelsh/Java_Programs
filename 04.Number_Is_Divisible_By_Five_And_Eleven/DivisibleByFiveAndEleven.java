import java.util.*;

public class DivisibleByFiveAndEleven{

 public static void main(String[] args)
 {
	
   Scanner Sc = new Scanner(System.in);

   System.out.print("Enter A Number = ");
   int No = Sc.nextInt();

   if(No % 5 == 0)
   {
	System.out.print("Number Is Divisible By 5");
   }
   else(No % 11 == 0)
   {
	System.out.print("Number Is Divisible By 11");
   }
 

}
	
}