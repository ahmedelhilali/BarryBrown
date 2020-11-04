package hashmaps;

import java.io.File;
import java.util.HashMap;
import java.util.Scanner;

public class Extract {
    public HashMap<String, String> readFile(String filename) {
        HashMap<String, String> person = new HashMap<>();
        try {
            Scanner in = new Scanner(new File(filename));
            String line;
            while (in.hasNext()){
                line = in.nextLine();
                String[] keyValue = line.split(": *");
                keyValue[0] = keyValue[0].trim();
                person.put(keyValue[0],keyValue[1]);
            }

            in.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return person;
    }

    public String getNameAddress() {
        HashMap<String, String> p = readFile("/home/ahmed/Desktop/Workshop/java/barryBrown/BarryBrown/src/hashmaps/data.txt");
        return p.get("name") + " " + p.get("Address");

    }
}
