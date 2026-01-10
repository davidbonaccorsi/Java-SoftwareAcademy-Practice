package Chapter67.e11;

public final record Push(int receiver, String subject, String body) implements Notification{

    @Override
    public void send(Priority priority) {
        if(this.checkContent(receiver, subject, body)){
            System.out.println("Push notification sent to " + receiver + " with subject " + subject + " and body " + body + " with priority " + priority);
            applyPriority(priority,this.getClass().getSimpleName());
        }
    }
}
