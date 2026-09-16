package DAY1_ConditionsDecisionMaking.Practice;

public class Problem3_FindSecondLargest {
    public static void main(String[] args) {
        int a = 30, b = 20, c = 10;
        // find largest element
        int smallest;
        int largest;
        int secondLargest = a;
        if (a == b || b == c || c == a) {
            System.out.println("No unique middle value");
        } else {

            if (a >= b && a >= c) {
                largest = a;
            } else if (b >= a && b >= c) {
                largest = b;
            } else {
                largest = c;
            }

            // find smallest
            if (a <= b && a <= c) {
                smallest = a;
            } else if (b <= a && b <= c) {
                smallest = b;
            } else {
                smallest = c;
            }
            if (largest!=a && smallest!=a){
                secondLargest=a;
            } else if (largest!=b && smallest!=b) {
                secondLargest=b;
            }else{
                secondLargest=c;
            }


            System.out.println(secondLargest);
        }
    }
}
