package Chapter6.e18;

public sealed interface Packet permits LoginPacket, DataPacket, ErrorPacket{
}
