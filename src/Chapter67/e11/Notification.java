package Chapter67.e11;

public sealed interface Notification permits Email, SMS, Push {

    void send(Priority priority);

    default boolean checkContent(int receiver, String subject, String body) {
        if(receiver < 0 ){
            System.out.println("Invalid receiver");
            return false;
        }
        if(subject.isBlank() || body.isBlank()){
            System.out.println("Subject or body cannot be blank");
            return false;
        }
        return true;
    }

    default void applyPriority(Priority priority, String type){
        System.out.println("Priority applied: " + priority + " | Notification type: " + type);
    }
}
