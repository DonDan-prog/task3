class Num7 
{
  public static void main(String args[]) 
  {
    System.out.println("isKaprekar(3) -> " + isKaprekar(3));
    System.out.println("isKaprekar(5) -> " + isKaprekar(5));
    System.out.println("isKaprekar(297) -> " + isKaprekar(297));
  }

  public static boolean isKaprekar(int n) 
  {
    int temp = n * n;
    String num = Integer.toString(temp);

    String left = null;
    String right = null;

    int len = num.length();
    if(len % 2 == 0)
    {
      left = num.substring(0, len/2);
      right = num.substring(len/2);
    }
    else
    {
      left = num.substring(0, (len-1)/ 2);
      right = num.substring( (len-1)/2);
    }
    
    if(left.equals("")) left = "0";
    if(right.equals("")) right = "0";

    return Integer.parseInt(left) + Integer.parseInt(right) == n;
  }
}
