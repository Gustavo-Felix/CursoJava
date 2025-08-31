package exercicies.section10.Ex09;

import exercicies.section10.Ex09.entities.Persona;

import java.util.*;

public class Application {
    public static void main(String[] args) {
        //Fazer um programa para ler um conjunto de nomes de pessoas e suas respectivas idades. Os nomes
        //devem ser armazenados em um vetor, e as idades em um outro vetor. Depois, mostrar na tela o nome
        //da pessoa mais velha.
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in).useDelimiter("\n");

        int nPersonas, position = 0;
        List<Persona> personas = new ArrayList<>();


        System.out.print("Quantas pessoas voce vai digitar? ");
        nPersonas = sc.nextInt();

        for (int i = 0; i < nPersonas; i++) {
            System.out.printf("Dados da %da pessoa: \n", i+1);
            System.out.print("Nome: ");
            String name = sc.next();
            System.out.print("Idade: ");
            int age = sc.nextInt();
            Persona persona = new Persona(name, age);
            personas.add(persona);
        }

        for (int i = 1; i < personas.toArray().length; i++) {
            if (personas.get(i-1).getAge() <= personas.get(i).getAge()) {
                position = i;
            }
        }

        System.out.println("PESSOA MAIS VELHA: " + personas.get(position).getName());

        sc.close();
    }
}
