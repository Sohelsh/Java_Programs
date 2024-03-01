package Pack;
import java.util.*;

public class Student
{
   Scanner Sc = new Scanner(System.in);
   int Tot = 0;
  public void getinfo()
  {
    System.out.print("Enter Student Name = ");
    String Name = Sc.nextLine();
    
    System.out.print("Enter Student Roll No = ");
    int Roll = Sc.nextInt();

    for(int i = 1; i <= 5;i++)
    {
       System.out.print("Enter Mark Subject No :"+ i +" = ");
       int Sub = Sc.nextInt();
       Tot = Tot + Sub;
    }
    
    double per = (Tot/5.0);

   System.out.println("==============================");
   System.out.println("Student Name =  " + Name);
   System.out.println("Student Roll No =  " + Roll);
   System.out.println("Student Percentage =  " + per);
    
  }

 
}
     
      