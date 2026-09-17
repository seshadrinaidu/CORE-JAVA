package DAY1_ConditionsDecisionMaking.Practice;

public class Problem9_ExactlyTwoEqual {
    public static void main(String[] args) {
        int a=-10,b=-1,c=-1;
        /*
        // Ternary  Operator
       System.out.println(
       (a==b && b==c )?"All three are equal":(a==b|| b==c||c==a)?"Exactly Two are equal":"All three are different"
       );
         */
        if (a==b && b==c){
            System.out.println("All Three are equal");
        }else if (a==b || b==c || c==a){
            System.out.println("Exactly Two are Equal");
        }else{
            System.out.println("All are different");
        }
    }
}
