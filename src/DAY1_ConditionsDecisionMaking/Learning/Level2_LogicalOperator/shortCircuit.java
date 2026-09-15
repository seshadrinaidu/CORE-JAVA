package DAY1_ConditionsDecisionMaking.Learning.Level2_LogicalOperator;

public class shortCircuit {
    public static void main(String[] args) {
        int x=5;
        if (x!=0 && (10/x > 1)){
            System.out.println("valid");
        }else {
            System.out.println("Invalid");
        }
    }
}
