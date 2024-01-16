import java.util.*;

public class CheckVowel
{
  public static void main(String[] args)
 {
   Scanner Sc = new Scanner(System.in);

   System.out.print("Enter Character =");
   char Ch = Sc.nextLine().charAt(0);

   if(Ch == 'A'|| Ch == 'a' || Ch == 'E' || Ch == 'e' || Ch == 'i' || Ch == 'I' || Ch == 'o' || Ch == 'O' || Ch == 'U' || Ch == 'u')
     {
       System.out.print("Given Character Is Vowel = " + Ch);
     }
   else
     {
      System.out.print("Given Character Is Consonant = " + Ch);
     }
}
}
     