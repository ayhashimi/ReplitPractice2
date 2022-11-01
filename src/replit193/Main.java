package replit193;

import java.util.LinkedList;
import java.util.List;

class Main
{
    public static void main(String[] args)
    {
        LinkedList<Integer> numList = new LinkedList<>();

        numList.add(111);
        numList.add(222);
        numList.add(333);
        numList.add(444);
        numList.add(555);
        numList.add(666);

        int temp = 0;

        for (int i = 0; i < 6; i++)
        {
            temp = temp + numList.get(i);
        }

        System.out.println(temp);
    }
}



















































/*



    Create Linked List that will store Integer Objects

    Add the values below:

        111

        222

        333

        444

        555

        666

        Create a logic to calculate sum of the all the values in list.

        Print the result of sum.

        **Expected Output:**

        ```
        Result of sum is 2331
        ```

*/
