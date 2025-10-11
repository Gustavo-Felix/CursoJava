package section18.funcional.function;

import java.util.function.Function;

public class ProductUpperName implements Function<Product, String> {
    @Override
    public String apply(Product product) {
        return product.getName().toUpperCase();
    }
}
