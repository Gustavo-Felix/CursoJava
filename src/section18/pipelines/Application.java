package section18.pipelines;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Application {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(3, 4, 5, 10, 7);

        Stream<Integer> st1 = list.stream().map(x -> x * 10);

        System.out.println(Arrays.toString(st1.toArray()));

        int sum = list.stream().reduce(0, (x, y) -> x + y); // Faz o somatório da lista

        System.out.println("Sum = " + sum);

        List<Integer> newList = list.stream()
                .filter(x -> x % 2 == 0) // filtra por valores pares [4, 10]
                .map(x -> x * 10) // Cada valor multiplicado por 10  (4 * 10, 10 * 10)
                .toList(); // Transforma em lista
        
        System.out.println(Arrays.toString(newList.toArray()));

    }
}
