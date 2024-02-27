class Prime implements Runnable
{
   public void run()
   { int j = 1,i = 1;
     
     for( j = 1; j <= 20;j++)
     {
       for(i = 2;i <= j;i++)
       {
        if(j % i == 0)
         {
           break;
         }
       }
       if(i == j)
       {
         System.out.print(j+" ");
       }
     }     
   }

   public static void main(String[] args)
   {
     Prime p = new Prime();
     Thread t1 = new Thread(p);
     t1.start();  
  }  
}

