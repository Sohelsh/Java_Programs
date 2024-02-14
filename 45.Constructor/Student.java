import java.util.*;

public class Student
{
  Scanner Sc = new Scanner(System.in);

   Student()
   {
      System.out.println("Enter Name =");
      String Name = Sc.next();
    
      System.out.println("Enter Age =");
      int Age = Sc.nextInt();

      System.out.println("Enter Course =");
      String Course = Sc.next();

      System.out.println("Enter City =");
      String City = Sc.next();

      System.out.println("Enter Percentage =");
      Float Per = Sc.nextFloat();

         System.out.println("***Student Information***");
       
         System.out.println("Student Name = "+Name);
         System.out.println("Student Age = "+Age);
         System.out.println("Student Course = "+Course);
         System.out.println("Student City = "+City);
         System.out.println("Student Percentage = "+Per);
             
  }

  public static void main(String args[])
  {
     Student Obj = new Student();
     //Obj.Student();
  }
}


