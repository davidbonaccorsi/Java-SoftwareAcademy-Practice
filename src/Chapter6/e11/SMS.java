package Chapter6.e11;

public final record SMS(int receiver, String subject, String body) implements Notification{
    @Override
    public void send(Priority priority) {
        if(this.checkContent(receiver, subject, body)){
            System.out.println("SMS sent to " + receiver + " with subject " + subject + " and body " + body + " with priority " + priority);
            applyPriority(priority,this.getClass().getSimpleName());
        }
    }
}
