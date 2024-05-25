package oop_pracitce.taskA;

public class Trapezium extends GeometricFigure {
    private double sideA;
    private double sideB;
    private double high;

    public Trapezium(double high, double sideA, double sideB) {
        this.high = high;
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public double area(){
        double midLine = (sideA + sideB) / 2;
        return midLine * high;
    }

    public double perimeter(){
        return 2 * (sideA + sideB);
    }

    public static void main(String[] args) {
        Trapezium trapezium = new Trapezium(4, 5, 10);
        trapezium.info();
    }
}
