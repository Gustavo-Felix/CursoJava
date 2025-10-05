package section17.wildcard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        List<?> myObjs = new ArrayList<Object>(); // Mas List<?> é o supertipo de qualquer lista, este o tipo curinga
        List<Integer> myNumbers = new ArrayList<Integer>();
        myObjs = myNumbers; // List<Integer> não é uma List<Object> - List<Object> não é um supertipo para lista

        List<Integer> myInts = Arrays.asList(5, 2, 10);
        printList(myInts);

        List<String> names = Arrays.asList("Gustavo", "Bruno", "João");
        printList(names);
    }

    public static void printList(List<?> list) {
        for (Object obj : list) {
            System.out.println(obj);
        }
    }
}
