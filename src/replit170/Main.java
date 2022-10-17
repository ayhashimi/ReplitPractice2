package replit170;

class Main
{
    final static void display(String word)
    {
        System.out.println("Final method with String parameter");
    }

    final static void display(Boolean bool)
    {
        System.out.println("Final method with boolean parameter");
    }

    public static void main(String[] args)
    {
        display(true);
        display("Yep");
    }
}








































/*








    For you to do:

        Overload 2 final instance methods:

        Call them in main method

        **Expected Output:**

        ```
        Final method with boolean parameter
        Final method with String parameter
        ```*/














