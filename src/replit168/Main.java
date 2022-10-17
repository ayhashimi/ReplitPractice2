package replit168;

class Main
{
    static final String reverse (String str)
    {
        String newString = "";

        for (int i = 4; i >= 0; i--)
        {
            newString = newString + str.charAt(i);
        }

        return newString;
    }

    public static void main(String[] args)
    {
        System.out.println(reverse("hello"));
    }
}










































/*

    For you to do:

        Create an instance final method that will reverse a String and return that new String

        Call method from the main method

        **Expected Output:**

        ```
        olleh
        ```

*/
