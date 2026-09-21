package DAY1_ConditionsDecisionMaking.Practice;

public class Problem11_ElectricityBill {
    public static void main(String[] args) {
        int units=350;
        int totalBill=0;
        if (units<0){
            System.out.println("Invalid Units");
        }else{
            if (units>=0 && units<=100){
                totalBill=units*2;
            } else if (units>100&& units<=200) {
                totalBill=100*2+(units-100)*3;
            } else if (units>200&&units<=300) {
                totalBill=100*2+100*3+(units-200)*5;
            }else {
                totalBill=100*2 + 100*3 + 100*5 + (units-300)*7;
            }
        }
        System.out.println(totalBill);
    }
}
