public class Num10 
{
    public static void main(String[] args)
    {
        System.out.println("rightTriangle(3, 4, 5) -> " + rightTriangle(3, 4, 5));
        System.out.println("rightTriangle(145, 105, 100) -> " + rightTriangle(145, 105, 100));
        System.out.println("rightTriangle(70, 130, 110) -> " + rightTriangle(70, 130, 110));
    }
    /** Checking is according to Pifagor rule: square of higher edge equals sum of square of other edges */
    public static boolean rightTriangle(int x, int y, int z)
    {
        boolean first_rule = (x * x == (y * y + z * z)); // one of three edges
        boolean second_rule = (y * y == (x * x + z * z)); // second rule
        boolean third_rule = (z * z == (x * x + y * y));
        return first_rule || second_rule || third_rule;
    }
}
