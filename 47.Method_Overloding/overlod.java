class overlod
{
  void Add(float No1, float No2)
  {
    System.out.print(No1+No2);
  }
  
   void Add(float No1, float No2,float No3)
  {
    System.out.print(No1+No2+No3);
  }
}

class Main
{
  public static void main(String[] args)
  {
    overlod Obj = new overlod();
    Obj.Add(2.3f,7.8f);
    Obj.Add(4.5f,9.8f,6.6f);
  }
}
    