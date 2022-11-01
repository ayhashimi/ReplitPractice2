package replit194;

import java.util.LinkedList;
import java.util.List;

class Main
{
    public static void main(String[] args)
    {

        List<String> countries = new LinkedList<>();
        countries.add("Armenia");
        countries.add("USA");
        countries.add("Kazakhstan");
        countries.add("Australia");
        countries.add("Pakistan");
        countries.add("Russia");
        countries.add("Azerbaijan");

        System.out.println(removeA(countries));
    }

    public static List<String> removeA(List<String> countries)
    {
        List<String> temp = new LinkedList<>();

        countries.forEach
                ( (String country) ->
                    {
                        if (country.charAt(0) != 'A')
                            temp.add(country);
                    }
                );

        return temp;
    }
}