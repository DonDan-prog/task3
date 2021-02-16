public class Num3 
{
  public static void main(String args[]) 
  {
    System.out.println("checkPerfect(6) -> " + checkPerfect(6));
    System.out.println("checkPerfect(28) -> " + checkPerfect(28));
    System.out.println("checkPerfect(496) -> " + checkPerfect(496));
    System.out.println("checkPerfect(12) -> " + checkPerfect(12));
    System.out.println("checkPerfect(97) -> " + checkPerfect(97));
  }

  public static boolean checkPerfect(int x) 
  {
    int temp = 0;
    for (int i = 1; i < x; ++i) {
      if (x % i == 0)
        temp += i;
    }
    return temp == x;
  }
}
