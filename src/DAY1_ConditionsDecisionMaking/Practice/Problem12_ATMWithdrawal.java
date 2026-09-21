package DAY1_ConditionsDecisionMaking.Practice;

public class Problem12_ATMWithdrawal {
    public static void main(String[] args) {
        int balance = 50000;
        int withdrawAmount = 25000;
        int dailyLimit = 20000;

        if (withdrawAmount < 0) {
            System.out.println("Must be positive");
        } else if (withdrawAmount % 100 != 0) {
            System.out.println("Must be multiple of hundred");
        } else if (withdrawAmount > balance) {
            System.out.println("Must be less than balance");
        } else if (withdrawAmount > dailyLimit) {
            System.out.println("Daily limit exceeds");
        } else {
            balance -= withdrawAmount;
            System.out.println("Withdraw Successful");
        }
        System.out.println("Current balance: " + balance);

    }
}
