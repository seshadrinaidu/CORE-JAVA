package DAY1_ConditionsDecisionMaking.Practice;

public class Problem6_CheckTriangle {
    public static void main(String[] args) {
        int a=5,b=8,c=10;
        if (a > 0 && b > 0 && c > 0 && a + b > c && a + c > b && b + c > a) {

            if (a==b && b==c){
            System.out.println("Equilateral");
            }
            else if (a == b || b == c || a == c) {
            System.out.println("Isosceles");
             }
              else {
              System.out.println("Scalene");
              }
        } else {
            System.out.println("Invalid Triangle");
        }

    }
}
