package Chapter67.e4;

public final class Contract {
    private final String role;
    private final int duration;

    public Contract(String role, int duration){
        this.role = role;
        this.duration = duration;
    }

    public String getRole() {
        return role;
    }

    public int getDuration() {
        return duration;
    }


}
