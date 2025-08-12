package exercicies.section08.Ex01.entities;

public class Rectangle {
    public double Width;
    public double Height;

    public double Area() {
        return Width * Height;
    }

    public double Perimeter() {
        return (Width * 2) + (Height * 2);
    }

    public double Diagonal() {
        return Math.sqrt((Width * Width) + (Height * Height));
    }
}
