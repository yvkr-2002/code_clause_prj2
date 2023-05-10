package newpro;
import java.util.Scanner;

public class AirlineReservationSystem {                         //project 2 AirlineResevationSystsme
    static boolean[] seats = new boolean[10];
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.print("Enter 1 for first class or 2 for economy: ");
            int section = input.nextInt();

            if (section == 1) {
                reserveFirstClass();
                break;
            } else if (section == 2) {
                reserveEconomy();
                break;
            } else {
                System.out.println("Invalid selection.");
            }
        }
    }

    public static void reserveFirstClass() {
        for (int i = 0; i < 5; i++) {
            if (seats[i] == false) {
                seats[i] = true;
                System.out.println("First Class. Seat #" + (i+1) + " is reserved.");
                break;
            } else if (i == 4 && seats[i] == true) {
                System.out.println("Sorry, First Class is full. Would you like to choose Economy?");
                int choice = input.nextInt();

                if (choice == 1) {
                    reserveEconomy();
                    break;
                } else {
                    System.out.println("Next flight is in 3 hours.");
                    System.exit(0);
                }
            }
        }
    }

    public static void reserveEconomy() {
        for (int i = 5; i < 10; i++) {
            if (seats[i] == false) {
                seats[i] = true;
                System.out.println("Economy. Seat #" + (i+1) + " is reserved.");
                break;
            } else if (i == 9 && seats[i] == true) {
                System.out.println("Sorry, Economy is full. Would you like to choose First Class?");
                int choice = input.nextInt();

                if (choice == 1) {
                    reserveFirstClass();
                    break;
                } else {
                    System.out.println("Next flight is in 3 hours.");
                    System.exit(0);
                }
            }
        }
    }
}
