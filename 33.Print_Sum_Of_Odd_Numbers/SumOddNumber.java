import java.util.*;

public class SumOddNumber
{
  public static void main(String[] args)
  {
    int No = 0;

    for(int i = 1; i <= 100;i++)
    {
      if(i % 2 != 0)
      {
        No = No + i;
      }
    }
	
      System.out.print(No);
  }
}
    
    
    