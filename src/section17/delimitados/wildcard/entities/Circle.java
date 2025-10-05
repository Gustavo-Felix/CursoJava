package section17.delimitados.wildcard.entities;

public class Circle implements Shape{

    private Double radius;

    public Circle(Double radius) {
        this.radius = radius;
    }

    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }

    @Override
    public double Area() {
        return Math.PI * radius * radius;
    }

}
