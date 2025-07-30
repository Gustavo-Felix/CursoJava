package section04;

public class ProcessData {
    public static void main(String[] args) {
        int x, y;
        x = 5;
        y = 2 * x;
        System.out.println(x);
        System.out.println(y);
        /*
        Sempre indique o tipo do número, se a expressão for de ponto flutuante (não inteira).
        Para double use:
        .0
        Para float use:
        f
        */
        double b, B, h, area;
        b = 6.0;
        B = 8.0;
        h = 5.0;
        /*
        float b, B, h, area;
        b = 6f;
        B = 8f;
        h = 5f;
        */
        area = (b + B) / 2.0 * h;
        System.out.println(area);

        int a, n;
        double result;
        a = 5;
        n = 2;
        result = (double) a / n;
        System.out.println(result);


    }
}
