package replit173;

abstract class Tea
{
    String teaType;

    public Tea(String tea)
    {
        teaType = tea;
    }

    abstract void addSugar();
}









































































/*# Abstraction

        Create a Super Class Tea that will have:


        i need an abstract class
        i need a constructor
        i need variable teaType, string
        void addSugar()


        new class Lemon Tea
        new class Chai Tea
        runtime polymorphism
        Tea lemon = new LemonTea();

        create one object of each

           implement addSugar in both classes




        - instance variable teaType;
        - constructor that will initialize
        - unimplemented method addSugar(),

        Create 2 subclasses of Tea as Lemon Tea and Chai Tea.

        In main class create an object of 2 Child and assign them to Parent reference type.

        Execute method addSugar from both classes.

        **Expected Output:**

        ```
        For Lemon Tea we need 2 spoons of sugar
        ```

        ```
        For Chai Tea we need 1 spoon of sugar
        ```*/

