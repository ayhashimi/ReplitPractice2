package replit173;

public class ChaiTea extends Tea
{
    public ChaiTea(String type)
    {
        super(type);
    }

    @Override
    void addSugar()
    {
        System.out.println("For " + teaType + " we need 1 spoons of sugar");
    }
}
