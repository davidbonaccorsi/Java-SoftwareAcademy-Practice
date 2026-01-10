package Chapter67.e11;

import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        NotificationService service = new NotificationService();
        service.sendAlert(1, "Server down", Priority.HIGH);
        service.sendAlert(2, "Server down", Priority.LOW);

        service.sendAlert(3, "Server down", Priority.HIGH);

        NotificationService service2 = new NotificationService();
        List<Integer> userIds = List.of(1,2,3,4,5,6,7);

        service.sendBroadcast("Server down", Priority.HIGH, userIds);

    }
}
