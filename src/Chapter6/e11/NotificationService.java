package Chapter6.e11;

import java.util.List;

public class NotificationService {


    public void sendAlert(int userId, String mesage, Priority priority){

        Notification notificationTool = switch(priority){
            case HIGH -> new Email(userId, "Alert", mesage);
            case MEDIUM -> new SMS(userId,"Alert", mesage);
            case LOW -> new Push(userId, "Alert", mesage);
        };

        notificationTool.send(priority);
    }

    public void sendBroadcast(String message, Priority priority, List<Integer> userIds){
        userIds.forEach(userId -> sendAlert(userId, message, priority));
    }
}
