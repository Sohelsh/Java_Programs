interface Polygons
{
  void getArea();
  default void getSides()
  {
    System.out.print("I Can get sides of a polygon");
  }
}

class Rectangles implements Polygons
{
  public void getArea(int length,int width)
  {
    System.out.println("The area of the rectangle is " +(length*width));
  }

  public void getSides()
  {
    System.out.print("I have 4 sides");
  }
}

class Square implements Polygons
{

  public void getArea(int length)
  {
   System.out.println("The area of the Square is " +(length*length));
  }

}

class main
{
  public static void main(String[] args)
  {
    Rectangle R1 = new Rectangle();
     R1.getArea(8,9);
     R1.getSides();
   
    Square S1 = new Square();
    R1.getArea(5);
    R1.getSides();
  }
}
