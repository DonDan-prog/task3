public class Num2 
{
    public static void main(String[] args)
    {
        System.out.println("findZip(\"all zip files are zipped\") -> " + findZip("all zip files are zipped"));
        System.out.println("findZip(\"all zip files are compressed\") -> " + findZip("all zip files are compressed"));
    }
    public static int findZip(String str)
    {
        int first_pos = str.indexOf("zip");
        int second_pos = str.indexOf("zip", first_pos + 1);
        return second_pos;
    }
}
