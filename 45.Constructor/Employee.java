 class Employee
{
   String Name, Des,City;
   int Age,Salary;
  
   Employee(String Nm,String des,String city,int age,int salary)
   {
       Name = Nm;
    
       Age = age;

       Des = des;

       City = city;

       Salary = salary;          
  }

   void Display()
  {      System.out.println("***Employee Information***");
       
         System.out.println("Employee Name = "+Name);
         System.out.println("Employee Age = "+Age);
         System.out.println("Employee Designation = "+Des);
         System.out.println("Employee City = "+City);
         System.out.println("Employee Salary = "+Salary);

   }
  public static void main(String args[])
  {
     Employee Obj = new Employee("Jay","Developer","Pune",25,2500);
     Obj.Display();
  }
}


