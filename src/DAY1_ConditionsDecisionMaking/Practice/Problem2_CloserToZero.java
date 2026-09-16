package DAY1_ConditionsDecisionMaking.Practice;

public class Problem2_CloserToZero {
    public static void main(String[] args) {
        int a=-1;
        int b=-1;
        int A=Math.abs(a);
        int B=Math.abs(b);
        if (A==B){
            System.out.println("both are at same distances");
        }else if (A<B){
            System.out.println(a+" is closer");
        }else{
            System.out.println(b+" is Closer");
        }
    }
}
