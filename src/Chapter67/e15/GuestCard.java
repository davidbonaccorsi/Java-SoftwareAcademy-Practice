package Chapter67.e15;

public record GuestCard(String visitorName, int tempId) implements KeyCard{

    @Override
    public SecurityLevel getLevel() { return SecurityLevel.LOW; }
}
