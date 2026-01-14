package Chapter6.e11;

public final record Email(int receiver, String subject, String body) implements Notification{
    @Override
    public void send(Priority priority) {
        if(this.checkContent(receiver, subject, body)){
            System.out.println("Email sent to " + receiver + " with subject " + subject + " and body " + body + " with priority " + priority);
            applyPriority(priority,this.getClass().getSimpleName());
        }
    }
}
