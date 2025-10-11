package exercicies.section18.Ex01;

import java.util.List;
import java.util.function.Predicate;

public class ProductService {
    public double filteredSum(List<Product> list, Predicate<Product> pred) {
        double sum = 0.0;
        for (Product product : list) {
            if (!pred.test(product)){
                System.out.println(product);
                sum += product.getPrice();
            }
        }
        return sum;
    }
}
