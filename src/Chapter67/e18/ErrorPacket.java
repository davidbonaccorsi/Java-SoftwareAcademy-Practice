package Chapter67.e18;

public record ErrorPacket(ErrorCode errorCode, String message) implements Packet{
}
