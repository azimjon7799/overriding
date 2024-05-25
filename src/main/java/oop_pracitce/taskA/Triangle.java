package oop_pracitce.taskA;

public class Triangle extends GeometricFigure {
    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    public double getSideC() {
        return sideC;
    }

    public void setSideC(double sideC) {
        this.sideC = sideC;
    }


    public double area(){
        double perimeter = this.perimeter() / 2;
        return Math.sqrt(perimeter * (perimeter - getSideA()) * (perimeter - getSideB()) * (perimeter - getSideC()));
    }

    public double perimeter(){
        return getSideA() + getSideB() + getSideC();
    }

    public static void main(String[] args) {
        Triangle triangle = new Triangle(3, 4, 5);
        triangle.info();
    }

}
