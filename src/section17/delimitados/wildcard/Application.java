package section17.delimitados.wildcard;

import section17.delimitados.wildcard.entities.Circle;
import section17.delimitados.wildcard.entities.Rectangle;
import section17.delimitados.wildcard.entities.Shape;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Application {

    public static void main(String[] args) {
        List<Integer> myInts = Arrays.asList(1, 2, 3, 4);
        List<Double> myDoubles = Arrays.asList(3.14, 6.28);
        List<Object> myObjs = new ArrayList<Object>();
        copy(myInts, myObjs);
        printList(myObjs);
        copy(myDoubles, myObjs);
        printList(myObjs);
    }
    public static void copy(List<? extends Number> source, List<? super Number> destiny) {
        for(Number number : source) {
            destiny.add(number);
        }
    }
    public static void printList(List<?> list) {
        for (Object obj : list) {
            System.out.print(obj + " ");
        }
        System.out.println();
    }

    public static void test2(String[] args) {

        List<Integer> intList = new ArrayList<>();
        intList.add(10);
        intList.add(5);
        List<? extends Number> list = intList;
        Number x = list.get(0);
        // list.add(20); // erro de compilacao por causa da covariância

        List<Object> myObjs = new ArrayList<Object>();
        myObjs.add("Maria");
        myObjs.add("Alex");
        List<? super Number> myNums = myObjs; // Tanto number quanto object
        myNums.add(10);
        myNums.add(3.14);
        /// Number x = myNums.get(0); // erro de compilacao por causa da contravariância
    }

    public static void test(String[] args) {

        List<Shape> myShapes = new ArrayList<>();
        myShapes.add(new Rectangle(3.0, 2.0));
        myShapes.add(new Circle(2.0));

        List<Circle> myCircles = new ArrayList<>();
        myCircles.add(new Circle(2.0));
        myCircles.add(new Circle(3.0));

        System.out.println("Total area: " + totalArea(myCircles));

    }

    public static double totalArea(List<? extends Shape> list) { // Pode receber de Shape ou Subtipos de Shape (Circle and Rectangle), não é possivel adicionar elementos na lista com o wildcard ativo
        if (list.isEmpty()) {
            throw new IllegalStateException("List is empty!");
        }
        double sum = 0.0;
        for (Shape s : list) {
            sum += s.Area();
        }
        return sum;
    }

}
