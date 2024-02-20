import java.util.*;

class Student
{
    String Name;
    int Roll_No;
    Scanner Sc = new Scanner(System.in);

   void GetInfo()
   {
      System.out.println("Enter Student Name = ");
      Name = Sc.next();
     
      System.out.println("Enter Student Roll No = ");
      Roll_No = Sc.nextInt();
      ShowInfo();
   }

   void ShowInfo()
   {
      System.out.println("Student Name = "+ Name);
      System.out.println("Student Roll No = "+ Roll_No);
   }
}

class libary extends Student
{
    void StuLab()
    {
      GetInfo();
      System.out.println("Memeber ID = 55");
    }
}
class Main
{
   public static void main(String[] args)
   {
     libary lb = new libary();
      lb.StuLab();
   }
}
