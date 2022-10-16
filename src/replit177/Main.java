package replit177;

public class Main implements Functions
{

    public double adding(double firstNumber, double secondNumber)
    {
        return firstNumber + secondNumber;
    }

    public double subtracting(double firstNumber, double secondNumber)
    {
        return firstNumber - secondNumber;
    }
    public double multiply(double firstNumber, double secondNumber)
    {
        return firstNumber * secondNumber;
    }
    public double divide(double firstNumber, double secondNumber)
    {
        return firstNumber / secondNumber;
    }

    @Override
    public void display(double result)
    {
        System.out.println(result);
    }

    public static void main(String[] args)
    {
        Main run = new Main();

        run.display(run.adding(70.0, 50.0));
        run.display(run.subtracting(180.0, 100.0));
        run.display(run.multiply(200.0, 10.0));
        run.display(run.divide(25.0, 5.0));


    }
}