import java.util.*;

public class CalculateGrade
{
  public static void main(String[] args)
  {
    
    Scanner Sc = new Scanner(System.in);
    
    int Marks[] = new int[5];
    int Tot = 0;
    for(int i = 0; i < 5;i++)
    {
      if(0 == i)
      {
	System.out.print("Enter Physics Mark = ");
        Marks[i] = Sc.nextInt();
        Tot += Marks[i];
      }
      else if(1 == i)
      {
	System.out.print("Enter Chemistry Mark = ");
        Marks[i] = Sc.nextInt();
	Tot = Tot + Marks[i];
      }
       else if(2 == i)
      {
	System.out.print("Enter Mathematics  Mark = ");
        Marks[i] = Sc.nextInt();
	Tot = Tot + Marks[i];
      }
      else if(3 == i)
      {
	System.out.print("Enter Biology Mark = ");
        Marks[i] = Sc.nextInt();
	Tot = Tot + Marks[i];
      }
      else if(4 == i)
      {
        System.out.print("Enter Computer Mark = ");
        Marks[i] = Sc.nextInt();
	Tot = Tot + Marks[i];
      }
    } 
    
    int per = ((Tot*100)/500);
    System.out.println("Total Mark = "+ per);

    if(per >= 90)
    {
        System.out.println("Grade A");
    }
    else if(per >= 80)
    {
        System.out.println("Grade B");
    }
    else if(per >= 70)
    {
        System.out.println("Grade C");
    }
    else if(per >= 60)
    {
        System.out.println("Grade D");
    }
    else if(per >= 40)
    {
        System.out.println("Grade E");
    }
    else
    {
        System.out.println("Grade F");
    }
}
}
