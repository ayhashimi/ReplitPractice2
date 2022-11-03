package replit186;


import java.util.ArrayList;
import java.util.Arrays;

/**
 Create an Arraylist of type Integer.

 Add below elements to it.

 111

 222

 333

 444

 555

 666

 Print the ArrayList.

 remove all the elements.

 Print the Arraylist.



 **Expected Output:**

 ```
 [111, 222, 333, 444, 555, 666]
 []
 ```
 */


public class Main
{
    public static void main(String[] args)
    {
        ArrayList<Integer> numList = new ArrayList<>(Arrays.asList(111, 222, 333, 444, 555, 666));

        System.out.println(numList.toString());

        numList.clear();

        System.out.println(numList.toString());
    }
}
