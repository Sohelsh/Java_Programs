import java.util.*;

public class CheckYoungest
{
  public static void main(String[] args)
  {
    Scanner Sc = new Scanner(System.in);

    System.out.println("Enter Ram Age = ");
    int Ram = Sc.nextInt();
    
    System.out.println("Enter Shyam Age = ");
    int Shyam = Sc.nextInt();
    
    System.out.println("Enter Ajay  Age= ");
    int Ajay = Sc.nextInt();

    if(Ram < Shyam && Ram < Ajay)
    {
      System.out.println("Ram Is Youngest Boy");
    }
    else if(Shyam < Ram && Shyam < Ajay)
    {
      System.out.println("Shyam Is Youngest Boy");
    }
    else
    {
      System.out.println("Ajay Is Youngest Boy");  
    }
}
}