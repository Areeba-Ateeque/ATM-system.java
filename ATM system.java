import java.util.*;

public class Game {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        char opt;
        int password = 1020;
        int user_input_pin;

        do {
            System.out.println("WELCOME TO MEEZAN BANK");
            System.out.println("1: Login");
            System.out.println("2: Register");
            System.out.println("3: Forgot Password");
            System.out.println("4: Exit");
            System.out.print("Enter your choice: ");
            int choice = scn.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter your PIN:");
                    user_input_pin = scn.nextInt();
                    if (user_input_pin == password) {
                        displayMainMenu();
                    } else {
                        System.out.println("INVALID PASSWORD");
                        System.out.println("PLEASE TRY AGAIN ");
                    }
                    break;
                case 2:
                    // Implement user registration functionality
                    System.out.println("User registration feature is under development.");
                    break;
                case 3:
                    // Implement forgot password functionality
                    System.out.println("Forgot password feature is under development.");
                    break;
                case 4:
                    System.out.println("Thank you for using MEEZAN BANK. Goodbye!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
                    break;
            }
        } while (true);
    }

    public static void displayMainMenu() {
        System.out.println("MAIN MENU");
        System.out.println("1: Check Balance");
        System.out.println("2: Withdraw Balance");
        System.out.println("3: Transfer Balance");
        System.out.println("4: Pay Bills");
        System.out.println("5: View Transaction History");
        System.out.println("6: Change PIN");
        System.out.println("7: Apply for Loan");
        // Add more options as needed
    }
}
