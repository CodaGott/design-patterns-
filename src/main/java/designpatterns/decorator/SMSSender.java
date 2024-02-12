package designpatterns.decorator;

public class SMSSender implements NotificationSender{

    private final NotificationSender notificationSender;

    public SMSSender(NotificationSender notificationSender) {
        this.notificationSender = notificationSender;
    }

    @Override
    public void send() {
        if (notificationSender != null){
            notificationSender.send();
        }
        System.out.println("Sending SMS Notification");
    }
}
