package exercicies.section10.Ex11;

import exercicies.section10.Ex11.entities.Persona;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        // Tem-se um conjunto de dados contendo a altura e o gênero (M, F) de N pessoas. Fazer um programa
        // que calcule e escreva a maior e a menor altura do grupo, a média de altura das mulheres, e o número
        // de homens.

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in).useDelimiter("\n");

        int nPersona, totalFemale = 0, totalMan = 0;
        double heigth, higher = 0.0, lower = 0.0, avgFemale = 0.0, totalFemaleHeigth = 0.0;
        char sex;
        List<Persona> personas = new ArrayList<>();

        System.out.print("Quantas pessoas serao digitadas? ");
        nPersona = sc.nextInt();

        for (int i = 0; i < nPersona; i++) {
            System.out.printf("Altura da %da pessoa: \n", i+1);
            heigth = sc.nextDouble();
            System.out.printf("Genero da %da pessoa: \n", i+1);
            sex = sc.next().charAt(0);
            Persona persona = new Persona(heigth, sex);
            personas.add(persona);
        }

        for (int i = 1; i < nPersona; i++) {
            if (personas.get(i-1).getHeight() <= personas.get(i).getHeight()){
                higher = personas.get(i).getHeight();
            }
            if (personas.get(i-1).getHeight() >= personas.get(i).getHeight()){
                lower = personas.get(i).getHeight();
            }
            if (personas.get(i-1).getSex() == 'F') {
                totalFemaleHeigth += personas.get(i-1).getHeight();
                totalFemale += 1;
            }
            if (personas.get(i-1).getSex() == 'M') {
                totalMan += 1;
            }
        }

        avgFemale = totalFemaleHeigth / totalFemale;

        System.out.println("Menor altura = " + lower);
        System.out.println("Maior altura = " + higher);
        System.out.println("Media das alturas das mulheres = " + avgFemale);
        System.out.println("Numero de homens = " + totalMan);

        sc.close();
    }
}
