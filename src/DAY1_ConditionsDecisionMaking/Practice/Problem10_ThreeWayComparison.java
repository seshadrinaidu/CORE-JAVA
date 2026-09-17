package DAY1_ConditionsDecisionMaking.Practice;

public class Problem10_ThreeWayComparison {
    public static void main(String[] args) {
        int a=-10,b=-1;
        System.out.println(
                          (a == b) ? "Both Are Equal" :
                        ((a > b) ? (a + "is Greater") : (b + " is Greater")));
    }
}
