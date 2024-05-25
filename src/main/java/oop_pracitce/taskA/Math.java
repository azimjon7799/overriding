package oop_pracitce.taskA;

public class Math {
    public static double sqrt(double number) {
        if (number < 0) {
            throw new IllegalArgumentException("Cannot compute square root of a negative number");
        }

        if (number == 0 || number == 1) {
            return number;
        }

        double guess = number / 2.0;

        double tolerance = 1e-10;

        while (Math.abs(guess * guess - number) > tolerance) {
            guess = (guess + number / guess) / 2.0;
        }

        return guess;
    }

    public static double abs(double number) {
        if (number < 0) {
            return -1 * number;
        }
        return number;
    }
}
