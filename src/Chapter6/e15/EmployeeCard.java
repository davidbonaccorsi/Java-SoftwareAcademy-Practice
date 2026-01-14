package Chapter6.e15;

public record EmployeeCard(String name, String department, SecurityLevel level) implements KeyCard {

    public EmployeeCard {
        System.out.println("EmployeeCard constructor");
    }

    @Override
    public SecurityLevel getLevel() {
        return level;
    }
}
