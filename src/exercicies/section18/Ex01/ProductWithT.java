package exercicies.section18.Ex01;

import java.util.function.Predicate;

public class ProductWithT implements Predicate<Product> {

    @Override
    public boolean test(Product product) {
        return product.getName().charAt(0) != 'T';
    }
}
