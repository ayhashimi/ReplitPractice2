package replit192;

import java.util.LinkedList;
import java.util.ArrayList;
import java.util.List;

class Main
{
    public static void main(String[] args)
    {
        List<Integer> primeList = new LinkedList<>();

        for (int i = 1; i < 101; i++)
        {
            if (isPrime(i) == true)
                primeList.add((Integer) i);
        }

        System.out.print(primeList.toString());
    }

    public static boolean isPrime(int number)
    {
        if (number <= 1)
            return false;

        for (int i = 2; i < number; i++)
        {
            if (number % i == 0)  return false;
        }

        return true;
    }
}






















/*


    Create an Linked List that will store all prime numbers from 1 to 100

        Step 1. Create a method that will identify wether number is prime or not

        Step 2. Add all prime numbers into Linked List

        Print Linked List:

        **Expected Output:**

        ```
        [2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97]
        ```



*/


















