package DAY1_ConditionsDecisionMaking.Practice;

public class Problem7_SecondLargest {
    public static void main(String[] args) {
        int a = 19, b = 1, c = 19;
        int largest=Integer.MIN_VALUE;
        int secondLargest=Integer.MIN_VALUE;
if (a==b && b==c){
    System.out.println("All are same values");
}else {
    if (a > largest) {
        largest = a;
    }
    if (b > largest) {
        largest = b;
    }
    if (c > largest) {
        largest = c;
    }
    System.out.println("Largest : " + largest);
    if (a != largest && a > secondLargest) {
        secondLargest = a;
    }
    if (b != largest && b > secondLargest) {
        secondLargest = b;
    }
    if (c != largest && c > secondLargest) {
        secondLargest = c;
    }

    System.out.println("Second Largest : " + secondLargest);
}
    }
}
