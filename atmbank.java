
import java.util.Scanner;
public class atmbank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int balance = 1000;
        int pin = 1234;

        System.out.println("Welcome to State Bank Of India ATM!");
        System.out.print("Enter your PIN: ");
        int userPin = scanner.nextInt();

        if (userPin == pin) {
            System.out.println("Login successful!");
            while (true) {
                System.out.println("1. Check Balance");
                System.out.println("2. Withdraw");
                System.out.println("3. Deposit");
                System.out.println("4. Exit");
                System.out.print("Choose an option: ");
                int option = scanner.nextInt();

                switch (option) {
                    case 1:
                        System.out.println("Your balance is: " + balance);
                        break;
                    case 2:
                        System.out.print("Enter amount to withdraw: ");
                        int withdrawAmount = scanner.nextInt();
                        if (withdrawAmount <= balance) {
                            balance -= withdrawAmount;
                            System.out.println("Withdrawal successful!");
                        } else {
                            System.out.println("Insufficient balance!");
                        }
                        break;
                    case 3:
                        System.out.print("Enter amount to deposit: ");
                        int depositAmount = scanner.nextInt();
                        balance += depositAmount;
                        System.out.println("Deposit successful!");
                        break;
                    case 4:
                        System.out.println("Exiting...");
                        return;
                    default:
                        System.out.println("Invalid option!");
                }
            }
        } else {
            System.out.println("Invalid PIN!");
        }
    }
}

