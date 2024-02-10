interface Polygon
{
  void getArea(int length,int width);
}

class Rectangle implements Polygon
{
  public void getArea(int length,int width)
  {
    System.out.println("The area of the rectangle is " +(length*width));
  }

  public static void main(String[] args)
  {
    Rectangle Obj = new Rectangle();
     Obj.getArea(8,9);
  }
}
