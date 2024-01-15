import java.util.*;

public class CheckAlphabet
{
  public static void main(String[] args)
  {
    Scanner Sc = new Scanner(System.in);
    
    System.out.print("Enter Any Character = ");
    char Ch = Sc.nextLine().charAt(0); 
    
    if((Ch >= 'A')&&(Ch <= 'Z') ||(Ch >= 'a') &&(Ch <= 'z'))
    {
      System.out.print("Character Is Alphabet ");
    }
    else
    {
      System.out.print("Character Is Not Alphabet");
    }
}
}