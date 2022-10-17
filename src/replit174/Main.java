package replit174;

public class Main implements MyInterface
{

    public static void main(String[] args)
    {
        Main run = new Main();

        run.method1();
        run.method2();
    }

    @Override
    public void method1()
    {
        System.out.println("implementation of method1");
    }

    @Override
    public void method2()
    {
        System.out.println("implementation of method2");
    }
}




