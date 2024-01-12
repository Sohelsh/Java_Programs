import java.util.*;

public class ConvertUpper
{
  public static void main(String[] args)
  {
    Scanner Sc = new Scanner(System.in);
    
    System.out.print("Enter Character = ");
    char Ch = Sc.nextLine().charAt(0);

    int Asc = Ch ;

    if(Asc >= 97 && Asc <= 122)
    {
	Ch = (char)(Asc - 32);     
   	System.out.print("Upper Case = "+ Ch);
    }
    else
    {
     	System.out.print("Character Already Lower Case ");
    }
}
}   