package section10;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Lists {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Gustavo");
        list.add("Bruno");
        list.add("Marcos");
        list.add("Maria");
        list.add(2, "teste");

        for (String s : list) {
            System.out.println(s);
        }

        System.out.println(list.size());

        System.out.println("-----------------------");

        list.remove("Gustavo");
        list.removeIf(s -> s.charAt(0) == 'G');

        for (String s : list) {
            System.out.println(s);
        }

        System.out.println("-----------------------");

        System.out.println("Index of Bruno: " + list.indexOf("Bruno"));
        System.out.println("Index of Arthur: " + list.indexOf("Arthur")); // Se não encontra o elemento, retorna -1

        System.out.println("-----------------------");

        List<String> results1 = list.stream().filter(s -> s.charAt(0) == 'M').toList(); // Cria uma lista imutável, neste caso, é o mais viável.
        List<String> results2 = list.stream().filter(s -> s.charAt(0) == 'M').collect(Collectors.toList()); // Cria uma lista mutável.

        for (String r : results1) {
            System.out.println(r);
        }

        System.out.println("-----------------------");

        String name = list.stream().filter(s -> s.charAt(0) == 'Q').findFirst().orElse(null); // Cria uma String name, que busca na list, os elementos que iniciam com a letra M, e pega o primeiro valor que conseguir, se não encontrar nenhum valor, retorna null

        System.out.println(name);
    }
}
