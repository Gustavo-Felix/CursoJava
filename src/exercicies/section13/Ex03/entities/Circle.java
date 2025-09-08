package exercicies.section13.Ex03.entities;

import exercicies.section13.Ex03.entities.enums.Color;

public class Circle extends Shape{
    private Double radius;

    public Circle() {
        super();
    }

    public Circle(Color color, Double radius) {
        super(color);
        this.radius = radius;
    }

    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }

    @Override
    public Double area() {
        double pi = 3.14;
        return pi * (radius * radius);
    }
}
