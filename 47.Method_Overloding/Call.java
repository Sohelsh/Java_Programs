class overlod
{
  void Area(int r)
  { 
    double pi = 3.14;

    System.out.println("Area of Circle = "+(pi*r*r));
  }
  
  void Area(int b,int h,int t)
  {
    System.out.println("Area of Triangle = "+((b*h)/t));
  }

  void Area(int w,int h)
  {
    System.out.println("Area of Rectangle = "+(w*h));
  }
}

class Call
{
  public static void main(String[] args)
  {
    overlod Obj = new overlod();
    Obj.Area(5);
    Obj.Area(9,8,2);
    Obj.Area(7,6);
  }
}
    