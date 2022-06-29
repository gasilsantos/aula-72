package lists;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;


public class ArrayList01 {
    
    public static void main(String[] args) {
        
        //criando uma lista do tipo ArrayList de inteiros
        List<Integer> numbers = new ArrayList<Integer>(2);
        
        //Adicionando itens
        numbers.add(61);
        numbers.add(91);
        numbers.add(91);
        numbers.add(30);
        numbers.add(150);
        numbers.add(1);

        System.out.println(numbers);

        //Ordenando em crescente
        Collections.sort(numbers);
        
        System.out.println(numbers);

        Collections.reverse(numbers);
        System.out.println(numbers);

        //obtendo um item pelo index
        System.out.println(numbers.get(2));

        numbers.remove(1);

        System.out.println(numbers);

    }

}
