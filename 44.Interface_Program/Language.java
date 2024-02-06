interface Language
{
  void getName(String Name);
}

class ProgrammingLanguage implements Language
{
  public void getName(String Name)
  {
    System.out.println("Programming Language :"+ Name);
  }

  public static void main(String[] args)
  {
    ProgrammingLanguage Obj = new ProgrammingLanguage();
    Obj.getName("Java"); 
  }
}
