package DAY1_ConditionsDecisionMaking.Learning.Level3_NestedGaurdClauses;

public class Nested {
    public static void main(String[] args) {
        int age=20;
        boolean hasLicense=false;
        if (age>=18){
            if (hasLicense){
                System.out.println("You Can Drive");
            }else{
                System.out.println("need license");
            }
        }else{
            System.out.println("Too young to drive");
        }
    }
}
