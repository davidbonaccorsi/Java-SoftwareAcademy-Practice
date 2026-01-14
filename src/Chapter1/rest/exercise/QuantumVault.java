package rest.exercise;

public class QuantumVault {
    static int activeConnections = 10;
    private int vaultCode;
    boolean isLocked = true;

    public QuantumVault(){
        activeConnections++;
    }

    public static void main (String[] args){
        short layer1 = 10;
        char layer2 = 'A';
        int secretKey;

        secretKey = (layer1+layer2)%(-4);

        QuantumVault v1 = new QuantumVault();
        QuantumVault v2 = new QuantumVault();

        boolean AlarmActive = false;
        if (( AlarmActive = true) || --activeConnections<10) {
            System.out.println("Breach detected");
        } else {
            System.out.println("System secure");
        }

        v1 = v2;
        v2 = null;
        var temp = v1;
        v1 = null;
        // Object which v1 pointed to before is now available for gc, the one that v2 pointed to before is still reffered by var temp

        System.out.println("Vault status: " + activeConnections + secretKey + " | Alarm: " + AlarmActive);

    }
}