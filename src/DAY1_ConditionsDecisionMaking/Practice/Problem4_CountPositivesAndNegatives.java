package DAY1_ConditionsDecisionMaking.Practice;

public class Problem4_CountPositivesAndNegatives {
    public static void main(String[] args) {
        int a = -5,
        b = 10,
        c = 0;
        int positiveCount=0, negativeCount=0, zeroCount=0;
        if (a > 0 ){
            positiveCount++;
        } else if (a<0 ) {
            negativeCount++;
        }else{
            zeroCount++;
        }
        if (b>0){
            positiveCount++;
        } else if (b<0) {
            negativeCount++;
        }else {
            zeroCount++;
        }
        if (c>0){
            positiveCount++;
        } else if (c<0) {
            negativeCount++;
        }else{
            zeroCount++;
        }
        System.out.println("Positive: " + positiveCount);
        System.out.println("Negative: " + negativeCount);
        System.out.println("Zero: " + zeroCount);    }
}
