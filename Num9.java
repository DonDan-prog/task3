public class Num9 
{
    public static void main(String[] args)
    {
        System.out.println("nextPrime(12) -> " + nextPrime(12));
        System.out.println("nextPrime(24) -> " + nextPrime(24));
        System.out.println("nextPrime(11) -> " + nextPrime(11));
    }
    public static int nextPrime(int n)
    {
        if(isPrime(n) == true)
            return n;
        else
        {
            n++;
            while(isPrime(n) == false) n++;
            return n;
        }
    }
    public static boolean isPrime(int n)
    {
        if(n % 2 == 0 || n % 3 == 0) return false;
        for(int i = 5; i < n; ++i)
        {
            if(n % i == 0)
                return false;
        }
        return true;
    }
}
