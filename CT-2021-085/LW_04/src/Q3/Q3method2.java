package Q3;

import java.util.Scanner;

public class Q3method2 {
    public static void main(String[] args) {
            Scanner scanner= new Scanner(System.in);

            System.out.println("Enter the power of 10 in integer:");
            int power= scanner.nextInt();

            String name;

            switch(power){
                case 6:
                    name="Million";
                    break;

                case 9:
                    name="Billion";
                    break;

                case 12:
                    name="Trillion";
                    break;

                case 15:
                    name="Quadrillion";
                    break;

                case 18:
                    name="Quintillion";
                    break;

                case 21:
                    name="Sextillion";
                    break;

                case 30:
                    name="Nonillion";
                    break;

                case 100:
                    name="Googol";
                    break;

                default:
                    name="Invalid power";
            }
                 System.out.println(name);

        }
}
