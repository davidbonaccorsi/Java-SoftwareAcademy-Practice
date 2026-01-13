package Chapter88.e7;

public class ServerRoom {
    public static void main(String[] args){

        int[] data = {15, 102, 55, 80, 10, 95};

        SensorData sdata = new SensorData(data,"Main server");

        Processor.processReadings(
                sdata,
                d -> d > 50,
                d -> d+=10,
                d -> System.out.println("High reading: " + d)
        );
    }
}
