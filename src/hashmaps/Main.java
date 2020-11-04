package hashmaps;

import java.util.HashMap;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Extract extract = new Extract();
        HashMap<String,String> e =extract.readFile("/home/ahmed/Desktop/Workshop/java/barryBrown/BarryBrown/src/hashmaps/data.txt");
        Set<String> keys = e.keySet();
        System.out.println(keys);
        for (String key: keys) {
            System.out.println(e.get(key));

        }

        System.out.println(e.get("Address"));
        System.out.println(e.get("name"));
        System.out.println(e.get("Occpation"));
    }
}
