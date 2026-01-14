package Chapter6.e15;

public class VaultSystem {

    public static String accessVault(KeyCard card){

        return switch(card){
            case EmployeeCard e when e.getLevel() == SecurityLevel.HIGH -> "[High] Access granted";
            case EmployeeCard e when e.getLevel() == SecurityLevel.MEDIUM -> "[Medium] Access granted";
            case EmployeeCard e when e.getLevel() == SecurityLevel.LOW -> "[Low] Access granted";
            case GuestCard g -> "[Guest] Access granted";
            default -> throw new IllegalStateException("Unexpected value: " + card);
        };
    }

    public static void main(String[] args) {
        KeyCard emp1 = new EmployeeCard("Alice", "Engineering", SecurityLevel.HIGH);
        KeyCard emp2 = new EmployeeCard("Bob", "Interns", SecurityLevel.LOW );
        KeyCard guest = new GuestCard("Visitor1", 101);

        System.out.println(accessVault(emp1)); // Expected: Access Granted: Alice (High Clearance)
        System.out.println(accessVault(emp2)); // Expected: Access Denied: Bob needs promotion
        System.out.println(accessVault(guest)); // Expected: Visitor Access: Lobby Only
    }
}
