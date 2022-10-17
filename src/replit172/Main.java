package replit172;

final class Main extends Parent
{
    public static void main(String[] yargPirates)
    {

        final int num = 5;
        Main run = new Main();

        run.m1();
        run.m2();
    }

    @Override
    final void m1()
    {
        System.out.println("Child class providing implementation");
    }
}

abstract class Parent
{
    abstract void m1();

    void m2()
    {
        System.out.println("Parent class providing implementation");
    }
}








































/*
# Abstraction

        Create a Parent Class in which you will have 1 implemented method
        m2 and 1 unimplemented method m1

        Make Main class to be a derived class from Parent.

        In main method execute both methods

        **Expected Output:**

        ```
        Child class providing implementation
        Parent class providing implementation
```
*/




