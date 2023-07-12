//Write a program which will overload method calculateArea which calculates area and perimeter of different shapes like circle, rectangle and square.

public class ShapeCalculator {
    public double calculateArea(double radius) {
        return Math.PI * radius * radius; // Area of a circle
    }

    public double calculateArea(double length, double width) {
        return length * width; // Area of a rectangle
    }

    public double calculateArea(double side) {
        return side * side; // Area of a square
    }

    public double calculatePerimeter(double radius) {
        return 2 * Math.PI * radius; // Circumference of a circle
    }

    public double calculatePerimeter(double length, double width) {
        return 2 * (length + width); // Perimeter of a rectangle
    }

    public double calculatePerimeter(double side) {
        return 4 * side; // Perimeter of a square
    }

    public static void main(String[] args) {
        ShapeCalculator calculator = new ShapeCalculator();

        double circleArea = calculator.calculateArea(3.5);
        System.out.println("Area of circle: " + circleArea);

        double rectangleArea = calculator.calculateArea(4.5, 6.0);
        System.out.println("Area of rectangle: " + rectangleArea);

        double squareArea = calculator.calculateArea(5.0);
        System.out.println("Area of square: " + squareArea);

        double circlePerimeter = calculator.calculatePerimeter(3.5);
        System.out.println("Perimeter of circle: " + circlePerimeter);

        double rectanglePerimeter = calculator.calculatePerimeter(4.5, 6.0);
        System.out.println("Perimeter of rectangle: " + rectanglePerimeter);

        double squarePerimeter = calculator.calculatePerimeter(5.0);
        System.out.println("Perimeter of square: " + squarePerimeter);
    }
}
