package Q1;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first integer:");
        int num1 = scanner.nextInt();

        System.out.println("Enter the second integer:");
        int num2 = scanner.nextInt();

        System.out.println("Enter the third integer:");
        int num3 = scanner.nextInt();

        if (num1 >= num2) {
            if (num3 >= num2) {
                System.out.println("Smallest number is " + num2);
            } else {
                System.out.println("Smallest number is " + num3);
            }
        } else if (num1 >= num3) {
            System.out.println("Smallest number is " + num3);
        } else {
            System.out.println("Smallest number is " + num1);
        }
    }
    }

