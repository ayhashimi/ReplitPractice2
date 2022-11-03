package replit185;


import java.util.ArrayList;
import java.util.Arrays;

/**
 * # ArrayList Loop
 *
 * Create an arrayList of type Integer.
 *
 * add below values.
 *
 * 111
 *
 * 111
 *
 * 111
 *
 * 999
 *
 * 999
 *
 * 999
 *
 * Print all the values of List 1 by 1:
 *
 * **Expected Output:**
 *
 * ```
 * 111
 * 111
 * 111
 * 999
 * 999
 * 999
 * ```
 */


class Main
{
    public static void main(String[] args)
    {
        ArrayList<Integer> numList = new ArrayList<>(Arrays.asList(111, 111, 111, 999, 999, 999));

        for (int num : numList)
        {
            System.out.println(num);
        }
    }
}
