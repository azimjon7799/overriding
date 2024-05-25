package oop_pracitce.taskA;

public class Rectangle extends GeometricFigure {
    private double sideA;
    private double sideB;

    public Rectangle(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public double area(){
        return sideA * sideB;
    }

    public double perimeter(){
        return 2*(sideA + sideB);
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 5);
        rectangle.info();
    }
}
