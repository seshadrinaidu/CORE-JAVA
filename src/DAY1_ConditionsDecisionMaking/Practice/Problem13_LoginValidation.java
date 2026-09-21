package DAY1_ConditionsDecisionMaking.Practice;

import java.util.Scanner;

public class Problem13_LoginValidation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String correctUsername = "admin";
        String correctPassword = "java123";
        String username = scanner.nextLine();
        String password = scanner.nextLine();


            if (!correctUsername.equals(username)) {
                System.out.println("invalid user name");
            } else if (!correctPassword.equals(password)) {
                System.out.println("invalid password");
            } else  {
                System.out.println("Login successful");

            }

    }
}
