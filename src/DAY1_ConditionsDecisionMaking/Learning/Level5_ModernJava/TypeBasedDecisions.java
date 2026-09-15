package DAY1_ConditionsDecisionMaking.Learning.Level5_ModernJava;

public class TypeBasedDecisions {
    public static void main(String[] args) {
        Object obj = '*';

        switch (obj) {
            case String s -> System.out.println("String length: " + s.length());
            case Integer i -> System.out.println("Integer value: " + i);
            default -> System.out.println("Unknown type");
        }

    }
}
