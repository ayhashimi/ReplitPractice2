package replit188;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Using Scanner class add 5 elements into ArrayList and then print all elements from that ArrayList all in 1 line
 *
 * Numbers in:
 *
 * ```
 * 4
 * ```
 *
 * ```
 * 62
 * ```
 *
 * ```
 * 8
 * ```
 *
 * ```
 * 5
 * ```
 *
 * ```
 * 4
 * ```
 *
 * **Expected Output:**
 *
 * ```
 * 4 62 8 5 4
 * ```
 */


public class Main
{
    public static void main(String[] args)
    {
        ArrayList<Integer> numList = new ArrayList<>();

        Scanner input = new Scanner(System.in);

        while (numList.size() != 5)
        {
            numList.add(input.nextInt());
        }

        for (int num : numList)
        {
            System.out.print(num + " ");
        }

    }
}
