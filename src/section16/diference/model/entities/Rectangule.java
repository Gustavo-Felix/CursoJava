package section16.diference.model.entities;

import section16.diference.model.enums.Color;

public class Rectangule extends AbstractShape {

    private Double width;
    private Double height;

    public Rectangule() {
    }

    public Rectangule(Color color, Double width, Double height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    public Double getWidth() {
        return width;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    @Override
    public Double area() {
        return width * height;
    }
}
