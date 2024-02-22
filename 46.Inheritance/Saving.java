class AC
{
	void Fun1()
	{
		
		int No = 54545;

		String Name = "SBI";
		
		System.out.println(" Account Number is = "+No);
		System.out.println("Account Name is = "+ Name);
	}
}
class Current extends AC
{
	void Fun2()
	{
		Fun1();	
	System.out.println("==================================");
	        int Bal = 9000;
		System.out.println("Current Balance  is = "+ Bal);
	}
}
class Saving extends AC
{
	void Fun3()
	{		System.out.println("==================================");
		int Sav = 5877;
		System.out.println("Saving Balance is = " + Sav);
	System.out.println("==================================");
	}

	public static void main(String args[])
	{
		Current c1 = new Current();
		c1.Fun2();
		Saving Obj = new Saving();
		Obj.Fun3();
	}	
}
