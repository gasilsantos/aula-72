package lists;

import java.util.List;
import java.util.LinkedList;

public class LinkedList01 {
    
    public static void main(String[] args) {
        
        List<String> names = new LinkedList<String>();

        names.add("joão");
        names.add("fulano");
        names.add("ciclano");
        names.add("filermino");
        names.add("francisclei");

        System.out.println(names);

        System.out.println(names.get(0));

        System.out.println(names.contains("jonas"));

        names.set(4,"jonas");

        System.out.println(names);

    } 

}
