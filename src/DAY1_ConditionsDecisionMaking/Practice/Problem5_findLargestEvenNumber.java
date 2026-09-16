package DAY1_ConditionsDecisionMaking.Practice;

public class Problem5_findLargestEvenNumber {
    public static void main(String[] args) {
        int a = 14, b = 14, c = 14;
        int largestEven = Integer.MIN_VALUE; // start with very small value

        if (a % 2 == 0 && a > largestEven) {
            largestEven = a;
        }
        if (b % 2 == 0 && b > largestEven) {
            largestEven = b;
        }
        if (c % 2 == 0 && c > largestEven) {
            largestEven = c;
        }

        if (largestEven == Integer.MIN_VALUE) {
            System.out.println("No even numbers found");
        } else {
            System.out.println("Largest even number: " + largestEven);
        }
    }
}
