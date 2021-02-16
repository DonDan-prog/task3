public class Num4 
{
    public static void main(String[] args)
    {
        System.out.println("flipEndChars(\"Cat, dog, and mouse.\") -> " + flipEndChars("Cat, dog, and mouse."));
        System.out.println("flipEndChars(\"ada\") -> " + flipEndChars("ada"));
        System.out.println("flipEndChars(\"Ada\") -> " + flipEndChars("Ada"));
        System.out.println("flipEndChars(\"z\") -> " + flipEndChars("z"));
    }
    public static String flipEndChars(String str)
    {
        if(str.length() <= 2)
            return "Incompatible";
        else if(str.charAt(0) == str.charAt(str.length()-1))
            return "Two's a pair";
        else
        {
            String ret = "" + str.charAt(str.length()-1);
            ret += str.substring(1, str.length()-1);
            ret += str.charAt(0);
            return ret;
        }
    }
}
