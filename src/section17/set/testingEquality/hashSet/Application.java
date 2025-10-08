package section17.set.testingEquality.hashSet;

import java.util.HashSet;
import java.util.Set;

public class Application {
    public static void main(String[] args) {
        Set<Product> set = new HashSet<>();

        set.add(new Product("TV", 900.0));
        set.add(new Product("Notebook", 1200.0));
        set.add(new Product("Tablet", 400.0));

        Product product = new Product("Notebook", 1200.0);

        System.out.println(set.contains(product)); // Pois está se baseando na referencia de memoria da instancia, e por não possuir o hashCode e equals na entidade Product
    }
}


