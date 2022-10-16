package replit176;

public class Main implements ChildInterface
{

    @Override
    public void childMethod()
    {
        System.out.println("Child Method-hello Syntax");
    }

    @Override
    public void parentMethod()
    {
        System.out.println("Parent Method-welcome to Syntax");
    }

    public static void main(String[] args)
    {
        Main run = new Main();

        run.parentMethod();
        run.childMethod();
    }
}
