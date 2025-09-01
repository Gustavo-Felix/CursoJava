package section10;

public class Boxing {
    public static void main(String[] args) {
        // Boxing
        int x = 20;
        Object obj = x;

        System.out.println(obj);

        // UnBoxing
        int y = (int) obj;

        System.out.println(y);

        // Wrapper classes  - Uso da Biblioteca java.lang - Aceitam valor nulo e usam recursos do OO
        Boolean b;
        Double d;
        Integer i;
        String s;
        Byte bt;

    }
}
