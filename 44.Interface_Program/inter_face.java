interface Student
{
   public void data();
}
class Stu implements Student
{
   public void data ()
  {
    String name= "Akshay Kumar";
    int rollno= 101;

    System.out.println(name);
    System.out.println(rollno);
   }
}
public class inter_face
{
     public static void main (String args [])
    {
      Stu Obj= new Stu();
      Obj.data();

     }
}