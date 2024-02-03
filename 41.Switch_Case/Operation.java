public class Operation
{
  public static void main(String args[])
  {
    int No1 = 35;
    int No2 = 25;
    int input = 2;

    switch(input)
    {
      case 1:
         System.out.print(No1+No2);
         break;
      case 2:
         System.out.print(No1-No2);
         break;
      case 3:
         System.out.print(No1*No2);
         break;
      case 4:
         System.out.print(No1/No2);
         break;

      default:
	 System.out.print("Invalid Input");
     }
  }
}