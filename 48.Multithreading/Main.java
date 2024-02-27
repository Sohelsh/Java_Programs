class Even extends Thread
{
  public void run()
  {
      System.out.println("Even Numbers");
    for(int i = 1; i <= 50;i++)
    {
       if(i % 2 == 0)
       {
         System.out.print(i+" ");
       }
    }
  }
} 
 
class Odd extends Thread
{
  public void run()
  { 
      System.out.println("Odd Numbers");

    for(int i = 1; i <= 50;i++)
    {
       if(i % 2 != 0)
       {
         System.out.print(i+" ");
       }
    }
  }
} 

class Main
{
  public static void main(String[] args)
  {
    Even E = new Even();
    E.start();
    
    Odd O = new Odd();
    O.start();
   
  }
}
  
 