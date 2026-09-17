package DAY1_ConditionsDecisionMaking.Practice;

public class Problem8_ExactlyOnePositive {
    public static void main(String[] args) {
        int a=-10,b=-1,c=-2;
        int positiveCount=0;
        if (a > 0) {

            positiveCount++;
        }
        if (b>0){
            positiveCount++;
        }
        if (c>0){
            positiveCount++;
        }
        String result=(positiveCount==1)?"Exactly 1 Positive":(positiveCount>1)?"More than 1 positive":"No positives";
        System.out.println(result);
    }
}
