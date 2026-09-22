package DAY1_ConditionsDecisionMaking.Practice;

import java.util.Scanner;

public class Problem14_OnlineShoppingCheckout {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String correctUserName = "Naidu";
        String correctPassword = "naidu123";

        System.out.print("Enter User Name : ");
        String userName = scanner.nextLine();

        System.out.print("Enter Password : ");
        String password = scanner.nextLine();

        int cartTotal = 950;
        int walletBalance = 2000;

        if (!correctUserName.equals(userName)) {
            System.out.println("Invalid Username");
        } else if (!correctPassword.equals(password)) {
            System.out.println("Invalid Password");
        } else {

            int deliveryCharges = (cartTotal >= 1000) ? 0 : 100;
            int finalAmount = cartTotal + deliveryCharges;

            if (finalAmount > walletBalance) {
                System.out.println("Insufficient Money in Wallet");
            } else {
                walletBalance -= finalAmount;
                System.out.println("Order Successful");
                System.out.println("Wallet Balance: " + walletBalance);
            }
        }

        scanner.close();
    }
}
