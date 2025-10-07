package section17.hashCode;

public class Application {
    public static void main(String[] args){

        Client c1 = new Client("Maria", "maria@gmail.com");
        Client c2 = new Client("Maria", "maria@gmail.com");

        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());

        System.out.println();

        System.out.println(c1.equals(c2)); // Comparando tanto os atributos name e email - True

        System.out.println(c1 == c2); // Referencia de memoria, são alocados em lugares diferentes na memoria

        String s1 = "Test";
        String s2 = "Test";

        System.out.println(s1 == s2); // apontam para o mesmo objeto na memória.

        // Se você criar a string explicitamente com new String("Test"), retona false, pois estão alocados em lugares diferentes na memoria

    }
}
