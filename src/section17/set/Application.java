package section17.set;

import java.util.*;

public class Application {
    public static void main(String[] args) {

        Set<String> set = new LinkedHashSet<>();

        System.out.println("Demo - 1");

        set.add("TV"); // No TreeSet, TV fica acima do Tablet pelo fato do V maiusculo ser menor que a
        set.add("Notebook");
        set.add("Tablet");

        System.out.println();

        System.out.println(set.contains("Notebook")); // Verifica se contém o valor Notebook no set

        System.out.println();

        for (String s : set){
            System.out.println(s);
        }

        System.out.println();

        set.remove("Tablet");

        for (String s : set){
            System.out.println(s);
        }

        System.out.println();

        set.removeIf(x -> x.charAt(0) == 't');

        for (String s : set){
            System.out.println(s);
        }

        System.out.println();

        System.out.println("Demo - 2");

        System.out.println();

        Set<Integer> a = new TreeSet<>(Arrays.asList(0,2,4,5,6,8,10));
        Set<Integer> b = new TreeSet<>(Arrays.asList(5,6,7,8,9,10));

        //union
        Set<Integer> c = new TreeSet<>(a); // Conjunto 'c' será uma cópia do conjunto 'a'
        c.addAll(b);
        System.out.println(c); // Inclui todos os valores, menos aqueles que já estão presentes

        //intersection
        Set<Integer> d = new TreeSet<>(a);
        d.retainAll(b);
        System.out.println(d); // Apresenta aqueles valores que estão inclusos nos dois Sets

        //difference
        Set<Integer> e = new TreeSet<>(a);
        e.removeAll(b);
        System.out.println(e); // Remove todos os valores do set 'e' que o set 'b' também possui

    }
}
