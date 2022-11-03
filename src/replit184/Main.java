package replit184;


import java.util.ArrayList;
import java.util.Arrays;

/**
 * # ArrayList
 *
 * Create a array list that will hold Integer Objects:
 *
 * Add below elements to it.
 *
 * 111
 *
 * 222
 *
 * 333
 *
 * 444
 *
 * 555
 *
 * 666
 *
 * Print first, third and fifth element from your array
 *
 * **Expected Output:**
 *
 * ```
 * 111
 * 333
 * 555
 * ```
 *
 */


class Main
{
    public static void main(String[] args)
    {
        ArrayList<Integer> numList = new ArrayList<>(Arrays.asList(111, 222, 333, 444, 555, 666));

        for (int num : numList)
        {
            if (num % 2 != 0)
                System.out.println(num);
        }
    }
}



