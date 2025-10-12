package exercicies.section18.Ex03;

import exercicies.section18.Ex03.entities.Employee;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in).useDelimiter("\n");

        System.out.print("Enter full file path: "); // src/exercicies/section18/Ex03/in.csv
        String path = sc.next();

        System.out.print("Enter salary: ");
        double salaryEntry = sc.nextDouble();

        List<Employee> list = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            String line = br.readLine();

            while (line != null) {
                String[] fields = line.split(",");

                String name = fields[0];
                String email = fields[1];
                double salary = Double.parseDouble(fields[2]);

                Employee employee = new Employee(name, email, salary);
                list.add(employee);

                line = br.readLine();
            }

            List<String> emails = list
                    .stream()
                    .filter(employee -> employee.getSalary() > salaryEntry)
                    .map(Employee::getEmail)
                    .sorted()
                    .toList();

            double totalSalary = list
                    .stream()
                    .filter(employee -> employee.getName().charAt(0) == 'M')
                    .map(Employee::getSalary)
                    .reduce(0.0, Double::sum);

            System.out.printf("Email of people whose salary is more than %.2f:\n", salaryEntry);
            emails.forEach(System.out::println);

            System.out.println("Sum of salary of people whose name starts with 'M': " + totalSalary);

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}