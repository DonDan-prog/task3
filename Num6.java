import java.util.HashSet;

class Num6 
{
  public static void main(String args[]) 
  {
    int[] test1_1 = { 1, 3, 4, 4, 4 };
    int[] test1_2 = { 2, 5, 7 };
    int[] test2_1 = { 9, 8, 7, 6 };
    int[] test2_2 = { 4, 4, 3, 1 };
    int[] test3_1 = { 2 };
    int[] test3_2 = { 3, 3, 3, 3 };

    System.out.println("same([1, 3, 4, 4, 4], [2, 5, 7]) -> " + same2(test1_1, test1_2));
    System.out.println("same([9, 8, 7, 6], [4, 4, 3, 1]) -> " + same2(test2_1, test2_2));
    System.out.println("same([2], [3, 3, 3, 3, 3]) -> " + same2(test3_1, test3_2));
  }

  public static boolean same(int[] a, int[] b) // variant one: w/o any java things
  {
    int[] temp1 = new int[a.length];
    int i_temp1 = 0;
    int[] temp2 = new int[b.length];
    int i_temp2 = 0;

    /** Filling temp arrays with unique vals */
    for (int i = 0; i < a.length; ++i) {
      boolean find = false;
      for (int j = 0; j < i_temp1; ++j) {
        if (a[i] == temp1[j]) {
          find = true;
          break;
        }
      }
      if (!find)
        temp1[i_temp1++] = a[i];
    }
    for (int i = 0; i < b.length; ++i) {
      boolean find = false;
      for (int j = 0; j < i_temp2; ++j) {
        if (b[i] == temp2[j]) {
          find = true;
          break;
        }
      }
      if (!find)
        temp2[i_temp2++] = b[i];
    }
    return i_temp1 == i_temp2;
  }

  public static boolean same2(int[] a, int[] b) // variant two, the smartest way, because set can contain only unique elements
  {
    HashSet<Integer> seta = new HashSet<Integer>();
    HashSet<Integer> setb = new HashSet<Integer>();
    for (int i : a)
      seta.add(i);
    for (int i : b)
      setb.add(i);
    return seta.size() == setb.size();
  }
}
