package DAY1_ConditionsDecisionMaking.Learning.Level4_ErrorPrevention;

public class Safe {
    public static void main(String[] args) {
        int numerator=10;
        int denominator=0;
        if (denominator!=0){
            int result=numerator/denominator;
            System.out.println("Result: "+result);
        }else{
            System.out.println("Error:can not divisible by zero");
        }
    }
}
