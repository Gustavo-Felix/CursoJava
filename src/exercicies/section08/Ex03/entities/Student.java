package exercicies.section08.Ex03.entities;

public class Student {
    public String name;
    public double mark1;
    public double mark2;
    public double mark3;
    public double result;

    public double passOrNot(){
        return this.mark1 + this.mark2 + this.mark3;
    }
}
