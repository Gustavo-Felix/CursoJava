public class FuncMath {
    public static void main(String[] args) {
        double x = 1.0;
        double y = 6.5;

        // double A = Math.sqrt(x); // Variável A recebe a raiz quadrada de x
        // double B = Math.pow(x, y); // Variável B recebe o resultado de x elevado a y
        // double C = Math.abs(x); // Variável C recebe o valor absoluto de x

        double n1 = 3.0;
        double n2 = 4.0;
        double n3 = -5.0;
        double A, B, C;
        A = Math.sqrt(n1);
        B = Math.sqrt(n2);
        C = Math.sqrt(25.0);
        System.out.println("Raiz quadrada de " + n1 + " = " + A);
        System.out.println("Raiz quadrada de " + n2 + " = " + B);
        System.out.println("Raiz quadrada de 25 = " + C);
        A = Math.pow(n1, n2);
        B = Math.pow(n1, 2.0);
        C = Math.pow(5.0, 2.0);
        System.out.println(n1 + " elevado a " + n2 + " = " + A);
        System.out.println(x + " elevado ao quadrado = " + B);
        System.out.println("5 elevado ao quadrado = " + C);
        A = Math.abs(n2);
        B = Math.abs(n3);
        System.out.println("Valor absoluto de " + n2 + " = " + A);
        System.out.println("Valor absoluto de " + n3 + " = " + B);
    }
}
