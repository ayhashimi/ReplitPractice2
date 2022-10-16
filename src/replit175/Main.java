package replit175;

public class Main implements SecondInterface
{
    public static void main(String[] args)
    {
        Main run = new Main();

        run.firstMethod();
        run.secondMethod();
    }

    @Override
    public void firstMethod()
    {
        System.out.println("First Method implementing multiple Inheritance");
    }

    @Override
    public void secondMethod()
    {
        System.out.println("Second Method implementing multiple Inheritance");
    }
}
