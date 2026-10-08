package study.extends01.ex03;

class Calculator {
    double area(double radius) {
        return 3.14 * radius *
                radius;
    }
}
class PreciseCalculator extends
        Calculator {
    @Override
    double area(double radius) {
        return Math.PI * radius *
                radius;
    }
}

public class CalculatorMain {
    public static void main(
            String[] args) {
        System.out.printf(
                java.util.Locale.ROOT,
                "%.4f%n", new
                        Calculator().area(2));
        System.out.printf(
                java.util.Locale.ROOT,
                "%.4f%n", new
                        PreciseCalculator().area(2));
    }
}