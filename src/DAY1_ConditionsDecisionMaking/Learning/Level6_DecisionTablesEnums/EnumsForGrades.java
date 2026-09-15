package DAY1_ConditionsDecisionMaking.Learning.Level6_DecisionTablesEnums;
enum Grade {A , B, C, FAIL}
public class EnumsForGrades {
    public static void main(String[] args) {
        int marks=60;
        Grade grade=(marks>=90)?Grade.A:
                (marks>=75)?Grade.B:
                        (marks>=50)?Grade.C:Grade.FAIL;
        System.out.print(grade);
    }
}
