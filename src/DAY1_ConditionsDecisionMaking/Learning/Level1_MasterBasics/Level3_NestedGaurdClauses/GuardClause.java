package DAY1_ConditionsDecisionMaking.Learning.Level1_MasterBasics.Level3_NestedGaurdClauses;

public class GuardClause {
    public static void main(String[] args) {
        int age=20;
        boolean hasLicense=true;
        if (age<18) return;
        if (!hasLicense) return;
        System.out.println("You can drive");
    }
}
