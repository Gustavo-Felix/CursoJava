package exercicies.section12.Ex01;

import exercicies.section12.Ex01.entities.Departament;
import exercicies.section12.Ex01.entities.HourContract;
import exercicies.section12.Ex01.entities.Worker;
import exercicies.section12.Ex01.entities.enums.WorkerLevel;

import java.time.LocalDate;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in).useDelimiter("\n");

        System.out.print("Enter departament's name: ");
        String nameDepartamentString = sc.next();
        Departament nameDepartament = new Departament(nameDepartamentString);

        System.out.println("Enter worker data:");
        System.out.print("Name: ");
        String nameWorker = sc.next();

        System.out.print("Level: ");
        String oS = sc.next();
        WorkerLevel levelWorker = WorkerLevel.valueOf(oS);

        System.out.print("Base Salary: ");
        Double baseSalaryWorker = sc.nextDouble();

        Worker worker = new Worker(nameWorker, levelWorker, baseSalaryWorker, nameDepartament);

        System.out.print("How many contracts to this worker? ");
        int nContracts = sc.nextInt();

        for (int i = 0; i < nContracts; i++) {
            System.out.printf("Enter contract #%d data: ", i+1);

            System.out.print("Date (DD/MM/YYYY): ");
            String dateString = sc.next();
            LocalDate date = LocalDate.parse(dateString, DateTimeFormatter.ofPattern("dd/MM/yyyy"));

            System.out.print("Value per hour: ");
            double valuePerHourWorker = sc.nextDouble();

            System.out.print("Duration (hours): ");
            int duration = sc.nextInt();

            HourContract contract = new HourContract(date, valuePerHourWorker, duration);

            worker.addContract(contract);
        }

        System.out.print("Enter month and year to calculate income (MM/YYYY): ");
        String calculateDateString = sc.next();
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("MM/yyyy");
        YearMonth calculateDate = YearMonth.parse(calculateDateString, dateFormat);
        int calculateYear = calculateDate.getYear();
        int calculateMonth = calculateDate.getMonthValue();
        System.out.println("Name: " + worker.getName());
        System.out.println("Departament: " + worker.getDepartament().getName());
        System.out.println("Income for " + calculateDateString + ": " + worker.income(calculateYear, calculateMonth));

        sc.close();
    }
}
