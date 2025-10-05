package section17.delimitados.generics.services;

import java.util.List;

public class CalculationService {

    public static <T extends Comparable<T>> T max(List<T> list) {
        if (list.isEmpty()) {
            throw new IllegalStateException("List is empty.");
        }

        T max = list.getFirst();

        for (T p : list) {
            if (p.compareTo(max) > 0) {
                max = p;
            }
        }
        return max;
    }
}
