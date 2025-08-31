package exercicies.section10.Ex10.entities;

public class Student {
    private String name;
    private double gradeA;
    private double gradeB;

    public Student(String name, double gradeA, double gradeB) {
        this.name = name;
        this.gradeA = gradeA;
        this.gradeB = gradeB;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGradeA() {
        return gradeA;
    }

    public void setGradeA(double gradeA) {
        this.gradeA = gradeA;
    }

    public double getGradeB() {
        return gradeB;
    }

    public void setGradeB(double gradeB) {
        this.gradeB = gradeB;
    }
}
