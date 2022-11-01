package replit171;




class Main extends Parent
{
    void m1 (String word)
    {
        System.out.println("m1 without parameters");
    }
    void m1 ()
    {
        System.out.println("m1 method with parameter");
    }
    public static void main(String[] args)
    {
        Main print=new Main();
        print.m1();
        print.m1("I am Janel");
    }
}
abstract class Parent{
    abstract void m1(String word);
    abstract void m1();
}



/*

abstract class Parent
{
    abstract void m1(String word);  //overloaded methods are methods that have the same name, but different sets of parameters
    abstract void m1();
}


class Main extends Parent
{

    @Override
    void m1(String word)
    {
        System.out.println("m1 method with parameter");
    }

    @Override
    void m1()
    {
        System.out.println("m1 without parameters");
    }

    public static void main(String[] args)
    {
        Main run = new Main();

        run.m1();
        run.m1("Hey");
    }
}
*/








































































/*

# Abstraction

        Create a Parent Class that will have two overloaded abstract methods m1

        Make Main class as concrete subclass to Parent Class

        In main method call the methods.

        **Expected Output:**

        ```
        m1 without parameters
        m1 method with parameter
        ```

*/














