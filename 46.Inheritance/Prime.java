public class runnableImpe
{
  public static void main(String[] args)
  {
     Prime p = new Prime();
     Thread t1 = new Thread(p);
     t1.start();
     
  }  
}

class Prime implements Runnable
{
   public void run()
   {
     System.out.print("Hello");
   }
}

