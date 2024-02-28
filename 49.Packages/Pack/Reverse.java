package Pack;

public class Reverse
{
  public void ReverseNumber()
  {
    int No = 12345,temp = 0,Dig = 0,Rev = 0;
    temp = No;
    while(temp != 0)
    {
      Dig = temp % 10;
      temp = temp / 10;
      Rev = (Rev*10) + Dig;
    }

    if(No == temp)
    {
      System.out.print("Given Number Is Equal " + No + " = "+ Rev);
    }
    else
    {
      System.out.print("Given Number Is Not Equal " + No +" = "+ Rev);
    }
    
  }
}
     
      