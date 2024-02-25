package com.example.calculator;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

import java.util.Scanner;

@SpringBootApplication
public class CalculatorApplication {

    public static void main(String[] args) {
        SpringApplication.run(CalculatorApplication.class, args);
    }
}

@Component
class CalculatorRunner implements CommandLineRunner {

    @Override
    public void run(String... args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Scientific Calculator Menu:");
            System.out.println("1. Square Root (√x)");
            System.out.println("2. Factorial (x!)");
            System.out.println("3. Natural Logarithm (ln(x))");
            System.out.println("4. Power Function (x^b)");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter a number: ");
                    double sqrtInput = scanner.nextDouble();
                    System.out.println("Square Root: " + squareRoot(sqrtInput));
                    break;
                case 2:
                    System.out.print("Enter a number: ");
                    int factorialInput = scanner.nextInt();
                    System.out.println("Factorial: " + factorial(factorialInput));
                    break;
                case 3:
                    System.out.print("Enter a number: ");
                    double lnInput = scanner.nextDouble();
                    System.out.println("Natural Logarithm: " + naturalLogarithm(lnInput));
                    break;
                case 4:
                    System.out.print("Enter base: ");
                    double base = scanner.nextDouble();
                    System.out.print("Enter exponent: ");
                    double exponent = scanner.nextDouble();
                    System.out.println("Power: " + power(base, exponent));
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 5);

        scanner.close();
    }

    public double squareRoot(double x) {
        return Math.sqrt(x);
    }

    public int factorial(int x) {
        if (x == 0)
            return 1;
        else
            return x * factorial(x - 1);
    }

    public double naturalLogarithm(double x) {
        return Math.log(x);
    }

    public double power(double base, double exponent) {
        return Math.pow(base, exponent);
    }
}
