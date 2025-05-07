package Q1;

import java.util.Scanner;

public class Q1method2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first integer:");
        int num1 = scanner.nextInt();

        System.out.println("Enter the second integer:");
        int num2 = scanner.nextInt();

        System.out.println("Enter the third integer:");
        int num3 = scanner.nextInt();

        int smallest;

        if(num1<=num2 && num1<=num3){
            smallest=num1;
        } else if (num2<=num1 && num2<=num3) {
            smallest=num2;
        }else{
            smallest=num3;
        }
        System.out.println("Smallest number is "+smallest);
    }
}
