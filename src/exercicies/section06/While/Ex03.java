package exercicies.section06.While;

import java.util.Locale;
import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args){
        // Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes. Escreva
        // um algoritmo para ler o tipo de combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina 3.Diesel
        // 4.Fim). Caso o usuário informe um código inválido (fora da faixa de 1 a 4) deve ser solicitado um novo código (até
        // que seja válido). O programa será encerrado quando o código informado for o número 4. Deve ser escrito a
        // mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada tipo de combustível, conforme
        // exemplo.
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int opc = 0;
        int al = 0;
        int gaso = 0;
        int die = 0;

        while (opc != 4){
            System.out.println("codificado da seguinte forma:");
            System.out.println("1.Álcool");
            System.out.println("2.Gasolina");
            System.out.println("3.Diesel");
            System.out.println("4.Fim");
            opc = sc.nextInt();
            if (opc == 1){
                al += 1;
            }
            if (opc == 2){
                gaso += 1;
            }
            if (opc == 3){
                die += 1;
            }
        }

        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: " + al);
        System.out.println("Gasolina: " + gaso);
        System.out.println("Diesel: " + die);

        sc.close();
    }
}
