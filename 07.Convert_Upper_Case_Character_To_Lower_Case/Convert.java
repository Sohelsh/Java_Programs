import java.util.*;

public class Convert
{
  public static void main(String[] args)
  {
    Scanner Sc = new Scanner(System.in);
    
    System.out.print("Enter Character = ");
    char Latter = Sc.next().charAt(0);
     
    int Asc = Latter;

   if(Asc >= 65 && Asc <= 90)
   {
     Latter = (char)(Asc + 32);
     System.out.print("Lower Case Is = "+ Latter);
   }
   else
   {
    System.out.print("Character Alreday Lower Case"); 
   }
}
}
    