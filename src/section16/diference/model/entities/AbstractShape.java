package section16.diference.model.entities;

import section16.diference.model.enums.Color;
import section16.diference.model.services.Shape;

public abstract class AbstractShape implements Shape {
    private Color color;

    public AbstractShape() {
    }

    public AbstractShape(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
