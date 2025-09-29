package section16.diference;

import section16.diference.model.entities.AbstractShape;
import section16.diference.model.entities.Circle;
import section16.diference.model.entities.Rectangule;
import section16.diference.model.enums.Color;

import java.util.Locale;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in).useDelimiter("\n");

        AbstractShape as1 = new Circle(Color.RED, 2.0);
        AbstractShape as2 = new Rectangule(Color.BLUE, 3.0, 4.0);

        System.out.println(as1.getColor());
        System.out.println(as1.area());
        System.out.println(as2.getColor());
        System.out.println(as2.area());
    }
}
