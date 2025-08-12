package exercicies.section08.Class.Ex02.entities;

public class Employee {
    public String Name;
    public double GrossSalary;
    public double Tax;

    public double NetSalary(){
        return GrossSalary - Tax;
    }

    public double IncreaseSalary(double percentage){
        return NetSalary() + (GrossSalary * (percentage / 100));
    }

    public String toString() {
        return Name + ", $" + GrossSalary;
    }
}

