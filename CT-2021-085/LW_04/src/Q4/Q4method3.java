package Q4;

import java.util.Scanner;

public class Q4method3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the year: ");
        int year = scanner.nextInt();

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println("This is a Leap year.");
        } else {
            System.out.println("This is not a Leap year.");
        }
    }
}
