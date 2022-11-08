package replit206;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * # Hash Map
 *
 * Create a Hash Map of String pairs
 *
 * add the follow values
 *
 * map.put("ONE","AAA");
 *
 * map.put("TWO","BBB");
 *
 * map.put("THREE","CCC");
 *
 * map.put("FOUR","DDD");
 *
 * map.put("FIVE","EEE");
 *
 * Using entry set print key and values pairs using loop
 *
 * Remove below from Map
 *
 * "ONE"
 *
 * "FOUR"
 *
 * Using entry set print key and values pairs using loop
 *
 * **Expected Output:**
 *
 * ```
 * HashMap Before Remove :
 * FIVE : EEE
 * ONE : AAA
 * FOUR : DDD
 * TWO : BBB
 * THREE : CCC
 * ------------------
 * HashMap After Remove :
 * FIVE : EEE
 * TWO : BBB
 * THREE : CCC
 * ```
 */


class Main
{
    public static void main(String[] args)
    {
        HashMap<String, String> map = new HashMap<>();

        map.put("ONE","AAA");
        map.put("TWO","BBB");
        map.put("THREE","CCC");
        map.put("FOUR","DDD");
        map.put("FIVE","EEE");

        System.out.println(map);

        Iterator mapIterator = map.entrySet().iterator();

        System.out.println("HashMap Before Remove : ");

        while (mapIterator.hasNext())
        {

            Map.Entry mapElement = (Map.Entry) mapIterator.next();

            System.out.println(mapElement.getKey() + " : " + ((String) mapElement.getValue()));
        }

        System.out.println("------------------");

        System.out.println("HashMap After Remove : ");

        map.remove("ONE");
        map.remove("FOUR");

        mapIterator = map.entrySet().iterator();

        while (mapIterator.hasNext())
        {

            Map.Entry mapElement = (Map.Entry) mapIterator.next();

            System.out.println(mapElement.getKey() + " : " + ((String) mapElement.getValue()));
        }
    }
}
