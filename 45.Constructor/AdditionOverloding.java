 class AdditionOverloding
{
   int No1,No2,No3,No4,No5;
   
   AdditionOverloding(int N1,int N2)
   {
	No1 = N1;
        No2 = N2;
     System.out.println("Addition Of Two Numbers = "+(No1+No2));
   }

   AdditionOverloding(int N1,int N2,int N3,int N4,int N5)
   {
	No1 = N1;
        No2 = N2;
        No3 = N3;
	No4 = N4;
 	No5 = N5;
     System.out.println("Addition Of Two Numbers = "+(No1+No2+No3+No4+No5));
   }

  
  public static void main(String args[])
  {
     AdditionOverloding Obj = new AdditionOverloding(50,20);
     AdditionOverloding Obj1 = new AdditionOverloding(50,20,58,45,5);
    
  }
}


