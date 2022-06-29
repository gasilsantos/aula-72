package maps;

import java.util.Map;
import java.util.HashMap;

public class HashMap01 {
    
    public static void main(String[] args) {
        
        Map<Integer, String> names = new HashMap<Integer, String>();

        names.put(0, "josafa");
        names.put(5, "maria");
        names.put(9, "carlota");
        names.put(3, "silvina");
        names.put(7, "capitu");
        names.put(4, "mariazinha");
        names.put(2, "josafa");

        System.out.println(names.keySet());

        System.out.println(names.values());

        System.out.println(names.entrySet()); 

        names.replace(4,"mariazinha" );

        names.remove(0);

        System.out.println(names.remove(2,"josafa"));
        System.out.println(names.remove(9,"maria"));



        System.out.println(names);

    }

}
