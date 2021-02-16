class Num5 
{
  public static void main(String args[]) 
  {
    System.out.println("isValidHexCode(\"#CD5C5C\") -> " + isValidHexCode("#CD5C5C"));
    System.out.println("isValidHexCode(\"#EAECEE\") -> " + isValidHexCode("#EAECEE"));
    System.out.println("isValidHexCode(\"#eaecee\") -> " + isValidHexCode("#eaecee"));
    System.out.println("isValidHexCode(\"#CD5C58C\") -> " + isValidHexCode("#CD5C58C"));
    System.out.println("isValidHexCode(\"#CD5C5Z\") -> " + isValidHexCode("#CD5C5Z"));
    System.out.println("isValidHexCode(\"#CD5C&C\") -> " + isValidHexCode("#CD5C&C"));
    System.out.println("isValidHexCode(\"CD5C5C\") -> " + isValidHexCode("CD5C5C"));
  }

  public static boolean isValidHexCode(String str) 
  {
    final String alphabet = "0123456789ABCDEFabcdef";
    if (str.charAt(0) != '#' || str.length() != 6 + 1)
      return false;
    for (int i = 1; i < str.length(); ++i) {
      if (alphabet.indexOf(str.charAt(i)) == -1)
        return false;
    }
    return true;
  }
}
