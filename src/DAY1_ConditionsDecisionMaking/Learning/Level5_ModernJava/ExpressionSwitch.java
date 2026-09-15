package DAY1_ConditionsDecisionMaking.Learning.Level5_ModernJava;

public class ExpressionSwitch {
    public static void main(String[] args) {
        int day=3;
        String result=switch (day){
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            default -> "Other day";
        };
        System.out.print(result);
    }
}
