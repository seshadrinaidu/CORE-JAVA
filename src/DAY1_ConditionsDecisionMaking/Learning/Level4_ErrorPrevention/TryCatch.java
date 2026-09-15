package DAY1_ConditionsDecisionMaking.Learning.Level4_ErrorPrevention;

public class TryCatch {
    public static void main(String[] args) {
        try {
            int[] arr = {1, 2, 3};
            int index = 5;

            if (index < arr.length) {
                System.out.println(arr[index]);
            } else {
                System.out.println("Error: Index out of range");
            }
        } catch (Exception e) {
            System.out.println("Unexpected error: " + e.getMessage());
        }

    }
}
