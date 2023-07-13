//Write a program which will make calculator application. Use Math class methods like pow, abs, max, min, exp, log, sqrt, cbrt, sin etc...

import java.util.Scanner;

public class CalculatorApplication{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Welcome to Calculator!");
        System.out.println("Available operations: +, -, *, /, pow, abs, max, min, exp, log, sqrt, cbrt, sin");
        
        while (true)
         {
            System.out.print("Enter an operation (or 'exit' to quit): ");
            String operation = scanner.nextLine();
            
            if (operation.equalsIgnoreCase("exit")) 
            {
                break;
            }
            
            System.out.print("Enter the first number: ");
            double num1 = scanner.nextDouble();
            
            double result = 0;
            boolean validOperation = true;
            
            switch (operation.toLowerCase()) 
            {
                case "+":
                    System.out.print("Enter the second number: ");
                    double num2 = scanner.nextDouble();
                    result = num1 + num2;
                    break;
                case "-":
                    System.out.print("Enter the second number: ");
                    num2 = scanner.nextDouble();
                    result = num1 - num2;
                    break;
                case "*":
                    System.out.print("Enter the second number: ");
                    num2 = scanner.nextDouble();
                    result = num1 * num2;
                    break;
                case "/":
                    System.out.print("Enter the second number: ");
                    num2 = scanner.nextDouble();
                    result = num1 / num2;
                    break;
                case "pow":
                    System.out.print("Enter the exponent: ");
                    double exponent = scanner.nextDouble();
                    result = Math.pow(num1, exponent);
                    break;
                case "abs":
                    result = Math.abs(num1);
                    break;
                case "max":
                    System.out.print("Enter the second number: ");
                    num2 = scanner.nextDouble();
                    result = Math.max(num1, num2);
                    break;
                case "min":
                    System.out.print("Enter the second number: ");
                    num2 = scanner.nextDouble();
                    result = Math.min(num1, num2);
                    break;
                case "exp":
                    result = Math.exp(num1);
                    break;
                case "log":
                    result = Math.log(num1);
                    break;
                case "sqrt":
                    result = Math.sqrt(num1);
                    break;
                case "cbrt":
                    result = Math.cbrt(num1);
                    break;
                case "sin":
                    result = Math.sin(num1);
                    break;
                default:
                    System.out.println("Invalid operation!");
                    validOperation = false;
                    break;
            }
            
            if (validOperation) {
                System.out.println("Result: " + result);
            }
            
            scanner.nextLine();
            System.out.println();
        }
        
        System.out.println("Thank you for using Calculator!");
        scanner.close();
    }
}
