
class Animal
{

    public Animal()
    {}

    void eat()
    {
        System.out.println("Animal eats");
    }

    void sleep()
    {
        System.out.println("Animal sleeps");
    }
}


class Cat
{
    void eat()
    {
        System.out.println("Cat eats");
    }

    void sleep()
    {
        System.out.println("Cat sleeps a lot");
    }

}

class kitten1 extends Cat
{
    void eat()
    {
        System.out.println("kitten1 eats milk" );
    }

    void sleep()
    {
        System.out.println("kitten1 sleeps a lot" );
    }
}

class kitten2 extends Cat
{
    void eat()
    {
        System.out.println("kitten2 eats snacks" );
    }

    void sleep()
    {
        System.out.println("kitten2 sleeps a lot" );
    }
}

class kitten3 extends Cat
{
    void eat()
    {
        System.out.println("kitten3 eats everything" );
    }

    void sleep()
    {
        System.out.println("kitten3 sleeps a lot" );
    }
}


class Main
{
    public static void main(String[] args)
    {
        Cat cat = new Cat();
        cat.eat();
        cat.sleep();


        Cat [] array = {new kitten1(), new kitten2(), new kitten3()};

        for (int i = 0; i < array.length; i ++)
        {
            array[i].eat();
            array[i].sleep();
        }

    }
}


































































/*
Create a class Animal in which define instance variable type, constructor that will initialize instance
variables and 2 methods eat and sleep.

        Create a subclass Cat in which override method sleep

        Create 3 Kitten subclasses of a Cat class and override method eat

for 1 kitten - eats milk

        for 2 kitten - eats snack

        for 3 kitten - eats everything

        In main method create object of Cat class and all 3 kittens classes and store into an array of Animals.
        Call available methods:

        **Expected Output:**

        ```
        Cat eats
        Cat sleeps a lot
        kitten1 eats milk
        kitten1 sleeps a lot
        kitten2 eats snacks
        kitten2 sleeps a lot
        kitten3 eats everything
        kitten3 sleeps a lot
        ```

*/


