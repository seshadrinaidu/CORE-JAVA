package DAY1_ConditionsDecisionMaking.Learning.Level6_DecisionTablesEnums;
enum TrafficLight{RED,YELLOW,GREEN}
public class DecisionTable {
    public static void main(String[] args) {
        TrafficLight signal=TrafficLight.RED;
        switch (signal){
            case RED -> System.out.println("Stop");
            case YELLOW -> System.out.println("Wait");
            case GREEN -> System.out.println("Go");
        }
    }
}
