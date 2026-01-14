package Chapter6.e18;

public class PacketHandler {

    public String handlePacket(Packet p){

        return switch(p){
            case LoginPacket lp when lp.username().equals("admin") -> "Admin Access Granted";
            case LoginPacket lp -> "User [" + lp.username() + "] Logged in";
            case ErrorPacket ep when ep.errorCode() == ErrorCode.AUTH_FAILED -> "CRITICAL ALERT: Auth Failure";
            case ErrorPacket ep -> "Error: " + ep.errorCode();
            case DataPacket dp -> "Data received with id: " + dp.id();
        };

    }
}
