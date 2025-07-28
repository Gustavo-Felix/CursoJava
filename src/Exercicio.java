import java.util.Locale;

public class Exercicio {
    public static void main(String[] args) {
        String product1 = "Computer";
        String product2 = "Office desk";
        int age = 30;
        int code = 5290;
        char gender = 'F';
        double price1 = 2100.00;
        double price2 = 650.50;
        double measure = 53.234567;

        System.out.println("Products:");
        System.out.printf(product1 + ", which price is $ " + price1 + "%n");
        System.out.printf(product2 + ", which price is $ " + price2 + "%n%n");
        System.out.printf("Record: %d years old, code %d and gender: %s", age, code, gender);
        System.out.println();
        System.out.println();
        System.out.printf("Measure with eight decimal places: %.8f", measure);
        System.out.println();
        System.out.printf("Rounded (three decimal places) %.3f", measure);
        System.out.println();
        Locale.setDefault(Locale.US);
        System.out.printf("US decimal point: " + measure  + "%n");
    }
}
