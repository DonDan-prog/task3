public class Num1
{
    public static void main(String[] args)
    {
        System.out.println("solutions(1, 0, -1) -> " + solutions(1, 0, -1));
        System.out.println("solutions(1, 0, 0) -> " + solutions(1, 0, 0));
        System.out.println("solutions(1, 0, 1) -> " + solutions(1, 0, 1));
    }
    public static int solutions(int a, int b, int c)
    {
        int val = b * b - 4 * a * c;
        if(val == 0)
            return 1;
        else if(val > 0)
            return 2;
        else
            return 0;
    }
}