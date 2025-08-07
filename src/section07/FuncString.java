package section07;

import java.util.Locale;
import java.util.Scanner;

public class FuncString {
    public static void main(String[] args){

        String word = "aaa BBB ccc DDD  ";
        String sw1 = word.toLowerCase();
        String sw2 = word.toUpperCase();
        String sw3 = word.trim();
        String sw4 = word.substring(2);
        String sw5 = word.substring(2, 9);
        String sw6 = word.replace('a', 'x');
        String sw7 = word.replace("aaa", "xxx");
        int i = word.indexOf("BB");
        int j = word.lastIndexOf("BB");

        System.out.println("Original: " + word + "-"); // Original
        System.out.println("toLowerCase: " + sw1 + "-"); // String com letras minúsculas
        System.out.println("toUpperCase: " + sw2 + "-"); // String com letras maiúsculas
        System.out.println("trim: " + sw3 + "-"); // Eliminando espaços nos cantos da string
        System.out.println("substring(2): " + sw4 + "-"); // Pega da posição inserida até o fim da string
        System.out.println("substring(2, 9): " + sw5 + "-"); // Pega da posição inserida até a posição inserida
        System.out.println("replace('a', 'x'): " + sw6 + "-"); // Troca os campos do valor 'a' por 'x'
        System.out.println("replace('abc', 'xyx'): " + sw7 + "-"); // Troca os campos do valor "aaa" por "xxx"
        System.out.println("indexOf(\"BB\"): " + i + "-"); // Indica a posição do valor "BB"
        System.out.println("indexOf(\"BB\"): " + j + "-"); // Indica a posição do ultimo valor "cc" inserido


        String fruits = "potato apple lemon";
        String[] vect = fruits.split(" ");
        System.out.println(vect[0]);
        System.out.println(vect[1]);
        System.out.println(vect[2]);

    }
}
