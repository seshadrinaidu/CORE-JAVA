package DAY1_ConditionsDecisionMaking.Practice;
public class CheckVoteEligibility {
    public static void main(String[] args) {
        int age=21;
        /* using ternory operator
        System.out.println((age>=18)?"Eligible":"not eligible");
        */
        // using if condition
        /*
        if (age>=18){
            System.out.println("eligible");
        }else{
            System.out.println("not eligible");
        }
         *
        */
        // gaurd clause simple and cleaner if true execute only
        if (age<18)return;
        System.out.println("eligible");

    }
}
