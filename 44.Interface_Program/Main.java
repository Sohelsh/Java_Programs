interface Polygons
{
  void getArea();
  default void getSides()
  {
    System.out.println("I Can get sides of a polygon");
  }
}

class Rectangles implements Polygons
{
  public void getArea()
  {
     int length = 10,width = 5;
    System.out.println("The area of the rectangle is " +(length*width));
  }

  public void getSides()
  {
    System.out.print("I have 4 sides");
  }
}

class Square implements Polygons
{

  public void getArea()
  {
    int length = 20;
   System.out.println("The area of the Square is " +(length*length));
  }

}

class Main
{
  public static void main(String[] args)
  {
    Rectangles R1 = new Rectangles();
     R1.getArea();
     R1.getSides();
   
    Square S1 = new Square();
    S1.getArea();
    S1.getSides();
  }
}
