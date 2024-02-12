package designpatterns.decorator;

public class EmailSender implements NotificationSender {

    private final NotificationSender sender;

    public EmailSender(NotificationSender sender) {
        this.sender = sender;
    }

    @Override
    public void send() {
        if (sender != null){
            sender.send();
        }
        System.out.println("Sending Email Notification");
    }
}
