package replit191;

import java.util.ArrayList;
import java.util.Iterator;

public class Main
{
    public static void main(String[] args)
    {
        ArrayList<Boolean> booleanList = new ArrayList<>();

        booleanList.add(true);
        booleanList.add(false);
        booleanList.add(false);

        Iterator iterator = booleanList.iterator();

        while(iterator.hasNext())
        {
            System.out.println(iterator.next());
        }
    }
}

















































/*

    Create an ArrayList of type boolean called listA and add below values

        ```
        (true, false, false)
        ```

        Create another array list call listB and ad all values from List A into it

        Using iterator print all values from ListB 1 by 1

        **Expected Output:**

        ```
        true
        false
        false
        ```
*/


















