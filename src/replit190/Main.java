package replit190;


import java.util.LinkedList;

/**
 * Create Linked List that will store first 10 numbers of fibonacci series
 *
 * Print number from Linked List 1 by 1 all in 1 line
 *
 * **Expected Output:**
 *
 * ```
 * 0 1 1 2 3 5 8 13 21 34
 * ```
 */


public class Main
{
    public static void main(String[] args)
    {
        int numBefore = 0;

        LinkedList<Integer> fibonacciSequence = new LinkedList<>();

        for (int i = 0; i < 10; i++)
        {
            fibonacciSequence.add(fibonacci(i));
        }

        while(!fibonacciSequence.isEmpty())
        {
            System.out.print(fibonacciSequence.remove() + " ");
        }
    }

    public static int fibonacci (int number)
    {
        if(number == 0)
        {
            return 0;
        }
        if(number == 1 || number == 2){
            return 1;
        }

        return fibonacci(number-2) + fibonacci(number-1);
    }
}







































