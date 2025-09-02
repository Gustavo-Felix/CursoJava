package exercicies.section10.Ex13;

import exercicies.section10.Ex13.entities.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in).useDelimiter("\n");

        String name;
        double salary;
        List<Employee> employees = new ArrayList<>();

        System.out.print("How many employees will be registered? ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.printf("Emplyoee #%d: \n", i+1);
            System.out.print("Id: ");
            int id = sc.nextInt();
            while (hasId(employees, id)) { // Verifica se possui esse id na lista
                System.out.print("Id already taken. Try again: ");
                id = sc.nextInt();
            }
            System.out.print("Name: ");
            name = sc.next();
            System.out.print("salary: ");
            salary = sc.nextDouble();
            employees.add(new Employee(id, name, salary));
        }

        System.out.println("Enter the employee id that will have salary increase: ");
        int id = sc.nextInt();
        Employee emp = employees.stream().filter(s -> s.getId() == id).findFirst().orElse(null);
        if (emp != null) {
            System.out.println("Enter the percentage: ");
            double percentage = sc.nextDouble();
            emp.increaseSalary(percentage);
        } else {
            System.out.println("This id does not exist!");
        }

        System.out.println("List of employees: ");
        for (Employee obj : employees) {
            System.out.println(obj);
        }

        sc.close();
    }

    public static boolean hasId(List<Employee> list, int id) {
        Employee employee = list.stream().filter(s -> s.getId() == id).findFirst().orElse(null);
        return employee != null;
    }
}
