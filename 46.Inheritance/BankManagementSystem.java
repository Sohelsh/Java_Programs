class Bank
{
    String bankName = "HDFC Bank";

    void displayBankDetails()
    {
        System.out.println("Bank Name: " + bankName);
    }
}

class BankBranch extends Bank
 {
    String branchName = "Karad";
    String branchLocation = "Karad";


    void displayBranchDetails()
    {
        System.out.println("Branch Name: " + branchName);
        System.out.println("Branch Location: " + branchLocation);
        displayBankDetails();
    }
}


class Customer extends BankBranch 
{
    String CustomerName = "Jay Kumar";
    double  Ac_No = 48745454;

    void displayCustomerDetails()
     {
       displayBranchDetails();
        System.out.println("Customer Name: " + CustomerName);
        System.out.println("Customer Account No: " + Ac_No);
     }
}

public class BankManagementSystem
{
    public static void main(String[] args)
    {
        Customer Obj = new Customer();
        Obj.displayCustomerDetails(); 
    }
}
