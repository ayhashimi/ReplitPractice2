package replit187;


import java.util.ArrayList;
import java.util.Iterator;

/**
 * Create an array list to type String.
 *
 * Add these values below to your arraylist
 *
 * hi
 *
 * yo
 *
 * sup
 *
 * yolo
 *
 * boop
 *
 * Remove 1, 3, 5 element from an array
 *
 * print remained values one by one in one line
 *
 * **Expected Output:**
 *
 * ```
 * yo yolo
 * ```
 */


public class Main
{
    public static void main(String[] args)
    {
        ArrayList<String> wordList = new ArrayList<>();

        wordList.add("hi");
        wordList.add("yo");
        wordList.add("sup");
        wordList.add("yolo");
        wordList.add("boop");

        Iterator iterator = wordList.iterator();

        int counter = 0;
        int max = wordList.size();

        while (counter < max)
        {
            iterator.next();

            if ((counter + 1) % 2 > 0)
                iterator.remove();

            counter++;
        }

        System.out.println(wordList.toString());
    }
}


















