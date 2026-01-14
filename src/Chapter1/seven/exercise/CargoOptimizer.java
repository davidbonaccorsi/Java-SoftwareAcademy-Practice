package seven.exercise;

public class CargoOptimizer {
    static int counts;
    static double money;
    static int totalWidgets = 127;
    static int crateCapacity = 10;
    static int fullCrates = totalWidgets/crateCapacity;
    static int looseWidgets = totalWidgets%crateCapacity;
    static int totalCratesUsed = (looseWidgets>0 ? fullCrates+1 : fullCrates);
    static boolean isAuditRequired = ((fullCrates > 10 || looseWidgets == 0) && totalWidgets % 2 != 0);
    static double CrateCost = 15.50;
    static double billingAmount = totalCratesUsed*CrateCost;

    public static void main(String[] args) {
        System.out.println("Total crates used: " +totalCratesUsed);
        System.out.println("Full crates : " +fullCrates);
        System.out.println("Lose widgets : " +looseWidgets);
        System.out.println("Leftovers: " + looseWidgets + " | Total: " + totalCratesUsed + " crates costing $" + billingAmount + " | Audit: " + isAuditRequired);


    }
}
