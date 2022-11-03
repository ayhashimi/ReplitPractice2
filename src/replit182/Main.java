package replit182;

public class Main
{
    public static void main(String[] args)
    {
        Person person = new Person( "John",
                                    "Doe",
                                    "10",
                                    "25",
                                    "1900",
                                    "123-45-6789");

        System.out.println(person.getFirstname());
        System.out.println(person.getLastname());
        System.out.println(person.formatBirthday());
        System.out.println(person.getSsn());



    }
}
