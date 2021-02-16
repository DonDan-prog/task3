public class Num8 
{   
    public static void main(String[] args)
    {
        System.out.println("longestZero(\"01100001011000\") -> " + longestZero("01100001011000"));
        System.out.println("longestZero(\"100100100\") -> " + longestZero("100100100"));
        System.out.println("longestZero(\"11111\") -> " + longestZero("11111"));
    }
    public static String longestZero(String str)
    {
        int longest = 0;
        int start = 0;

        int len = str.length() - 1;
        for(int i = 0; i < len;)
        {
            if(str.charAt(i) == '0')
            {  
                int temp_start = i;
                int temp_len = 0;
                for(; str.charAt(i) == '0' && i < len; ++i, ++temp_len);
                if(longest < temp_len)
                {
                    longest = temp_len;
                    start = temp_start;
                }
            }
            else
                i++;
        }

        return str.substring(start, start + longest);
    }
}
