package section10;

public class forEach {
    public static void main(String[] args) {
        String[] nomes = new String[] {"Maria", "Bob", "Alex"};

        // for
        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }

        System.out.println();

        // forEach
        for (String nome : nomes) {
            System.out.println(nome);
        }
    }
}
