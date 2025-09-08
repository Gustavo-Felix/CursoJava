package exercicies.section13.Ex01;

import exercicies.section13.Ex01.entities.Employee;
import exercicies.section13.Ex01.entities.OutsourcedEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in).useDelimiter("\n");

        List<Employee> employees = new ArrayList<>();

        System.out.print("Enter the number of employees: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.printf("Employee #%d data:\n", i+1);
            System.out.print("Outsourced (y/n)? ");
            char option = sc.next().charAt(0);

            System.out.print("Name: ");
            String name = sc.next();

            System.out.print("Hours: ");
            int hours = sc.nextInt();

            System.out.print("Value per hour: ");
            double vPH = sc.nextDouble();

            if (option == 'y'){
                System.out.print("Additional charge: ");
                double addCharge = sc.nextDouble();

                Employee employee = new OutsourcedEmployee(name, hours, vPH, addCharge);
                employees.add(employee);
            } else {
                Employee employee = new Employee(name, hours, vPH);
                employees.add(employee);
            }
        }

        System.out.print("PAYMENTS:\n");
        for (Employee e : employees) {
            System.out.println(e.getName() + " - $ " + e.payment());
        }
    }
}
