package DAY1_ConditionsDecisionMaking.Learning.Level4_ErrorPrevention;

public class UsingException {
    public static void main(String[] args) {
        int numerator=10;
        int denominator=10;

        if (denominator==0){
            throw new IllegalArgumentException("Denominator cannot be null");
        }
        int result=numerator/denominator;
        System.out.println(result);
    }
}
