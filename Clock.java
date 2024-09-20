public class Clock
{
  public static void main(String[] args)
  {
    clock(4);
  }

  public static int clock(int x)
  {
    if (x != 0)
    {
      if (x < 12)
      {
        System.out.println("It is currently morning");
      }
      else if (x < 18)
      {
        System.out.println("It is currently the afternoon");
      }
      else if (x <= 24)
      {
        System.out.println("It is currently evening");
      }
    }else 
    {
      System.out.println("It is currently midnight");Object u;
    }
  }

}
