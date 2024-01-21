import java.util.*;

public class CheckInteger
{
  public static void main(String[] args)
  {
    Scanner Sc = new Scanner(System.in);

    System.out.println("Enter A Integer = ");
    int No = Sc.nextInt();

    if(No % 5 == 0)
    {
       System.out.println("the given integer is a multiple of 5 ");
    }
    else
    {
       System.out.println("the given integer is not multiple of 5 ");
    }
}
}


