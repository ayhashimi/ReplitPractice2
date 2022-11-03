package replit183;


import java.util.ArrayList;

/**
 * # ArrayLists
 *
 * Create an array list that will hold String Objects
 *
 * Find out wether array list is empty or not.
 *
 * Add String value "Syntax" to it
 *
 * Find out wether array list is empty or not.
 *
 * **Expected Output:**
 *
 * ```
 * true
 * false
 * ```
 */


public class Main
{
    public static void main(String[] args)
    {
        ArrayList<String> stringList = new ArrayList<>();

        System.out.println(stringList.isEmpty());

        stringList.add("Syntax");

        System.out.println(stringList.isEmpty());
    }
}
