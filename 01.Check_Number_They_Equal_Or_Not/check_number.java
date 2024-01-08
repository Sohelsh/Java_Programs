import java.util.*;  

public class check_number{

	public static void main(String[] args){

	Scanner sc = new Scanner(System.in); 

	System.out.print("Enter First Number = ");
	int No1 = sc.nextInt();

	System.out.print("Enter Second Number = ");
	int No2 = sc.nextInt();

	if(No1 == No2)
	{
	 System.out.print("Number Are Equal");
	}
	else
	{
	 System.out.print("Number Are Not Equal");
	}
}
}