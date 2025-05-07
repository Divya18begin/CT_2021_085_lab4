package Q5;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("*** Welcome to MyJava Lo-Fat Burgers ***");

        // Entree Menu
        System.out.println("\n**** Entree Menu ****");
        System.out.println("1 -> Tofu Burger     $3.49");
        System.out.println("2 -> Cajun Chicken   $4.59");
        System.out.println("3 -> Buffalo Wings   $3.99");
        System.out.println("4 -> Rainbow Fillet  $2.99");

        // Side Dish Menu
        System.out.println("\n**** Side Dish Menu ****");
        System.out.println("1 -> Rice Cracker    $0.79");
        System.out.println("2 -> No-Salt Fries   $0.69");
        System.out.println("3 -> Zucchini        $1.09");
        System.out.println("4 -> Brown Rice      $0.59");

        // Drink Menu
        System.out.println("\n**** Drink Menu ****");
        System.out.println("1 -> Cafe Mocha      $1.99");
        System.out.println("2 -> Cafe Latte      $1.90");
        System.out.println("3 -> Espresso        $2.49");
        System.out.println("4 -> Oolong Tea      $0.99");

        int entree;
        int eqty = 0;
        //*****Entree selection*****
        System.out.println("Enter 0 to skip the Entree menu or Enter 1 to 4:");
        entree = scanner.nextInt();
        while (entree < 1 || entree > 4) {
            System.out.println("Invalid entree! Please enter again.");
            entree = scanner.nextInt();
        }

        double ecost = 0;
        switch (entree) {
            case 1:
                ecost = 3.49;
                break;

            case 2:
                ecost = 4.59;
                break;

            case 3:
                ecost = 3.99;
                break;

            case 4:
                ecost = 2.99;
                break;
        }

        if (entree != 0) {
            System.out.println("Enter the quantity");
            eqty = scanner.nextInt();
        }

        int side;
        //*****Side dish selection*****
        System.out.println("Enter 0 to skip the Side Dish menu or Enter 1 to 4:");
        side = scanner.nextInt();
        while (side < 1 || side > 4) {
            System.out.println("Invalid entree! Please enter again.");
            side = scanner.nextInt();
        }

        double scost = 0;
        int sqty = 0;
        switch (side) {
            case 1:
                scost = 0.79;
                break;

            case 2:
                scost = 0.69;
                break;

            case 3:
                scost = 1.09;
                break;

            case 4:
                scost = 0.59;
                break;
        }

        if (side != 0) {
            System.out.println("Enter the quantity");
            sqty = scanner.nextInt();
        }

        int drink;
        int dqty = 0;
        //*****Drink selection*****
        System.out.println("Enter 0 to skip the Drink menu or Enter 1 to 4:");
        drink = scanner.nextInt();
        while (drink < 1 || drink > 4) {
            System.out.println("Invalid entree! Please enter again.");
            drink = scanner.nextInt();
        }

        double dcost = 0;
        switch (drink) {
            case 1:
                dcost = 1.99;
                break;

            case 2:
                dcost = 1.90;
                break;

            case 3:
                dcost = 2.49;
                break;

            case 4:
                dcost = 0.99;
                break;
        }

        if (drink != 0) {
            System.out.println("Enter the quantity");
            dqty = scanner.nextInt();
        }

        //Display Bill
        if (entree == 0 && side == 0 && drink == 0) {
            System.out.println("No Items Selected");
        } else {
            double total = (eqty * ecost) + (sqty * scost) + (dqty * dcost);

            System.out.println("\n*** Your Order ***");
            System.out.println("Category     Price   Qty   Amount");
            System.out.println("-----------------------------------");
            System.out.printf("Entree:      $%.2f    %d    $%.2f\n", ecost, eqty, ecost * eqty);
            System.out.printf("Side Dish:   $%.2f    %d    $%.2f\n", scost, sqty, scost * sqty);
            System.out.printf("Drink:       $%.2f    %d    $%.2f\n", dcost, dqty, dcost * dqty);
            System.out.println("-----------------------------------");
            System.out.printf("Total:                     $%.2f\n", total);
            System.out.println("-----------------------------------");
        }

    }
}


