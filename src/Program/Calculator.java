package Program;

import java.util.Scanner;

public class Calculator {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter number 1: ");
    double num1 = scanner.nextDouble();

    System.out.print("Enter operator (+, -, *, /): ");
    String operator = scanner.next();

    System.out.print("Enter number 2: ");
    double num2 = scanner.nextDouble();

    double result = 0;

    switch (operator) {
      case "+":
        result = num1 + num2;
        break;
      case "-":
        result = num1 - num2;
        break;
      case "*":
        result = num1 * num2;
        break;
      case "/":
        result = num1 / num2;
        break;
      default:
        System.out.println("Invalid operator");
        return;
    }

    System.out.println("Result: " + result);
  }
}