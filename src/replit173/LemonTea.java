package replit173;

public class LemonTea extends Tea
{
    public LemonTea(String type)
    {
        super(type);
    }

    @Override
    void addSugar()
    {
        System.out.println("For " + teaType + " we need 2 spoons of sugar");
    }
}
