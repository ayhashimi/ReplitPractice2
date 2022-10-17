package replit169;

class Main
{
    public static void main(String[] args)
    {

        int[] a = {2,7,3,8,4};

        System.out.println(avgElements(a)); //should print 4.8

    }

    final static double avgElements (int [] array)
    {
        double total = 0;

        for (int i = 0; i < array.length; i++)
        {
            total = total + array[i];
        }

        return total / array.length;
    }

}
















































/*
**For you to do:**

        Create final method avgElements that will average all the elements in an integer
        * array (passed to the method as a parameter) and return the average.

        **Expected Output:**

        ```
        4.8
        ```

*/














