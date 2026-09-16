package DAY1_ConditionsDecisionMaking.Practice;


public class Problem1_FindTheMiddleElement {
    public static void main(String[] args) {
        int a = 30, b = 20, c = 10;
        // find largest element
        int smallest;
        int largest;
        int middle = a;
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
       System.out.println(smallest+" "+largest);

      middle=a+b+c-smallest-largest;
        System.out.println(middle);
    }

    }
}
