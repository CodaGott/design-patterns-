package designpatterns.decorator;

public class PushNotification implements NotificationSender{

    private final NotificationSender notificationSender;

    public PushNotification(NotificationSender notificationSender) {
        this.notificationSender = notificationSender;
    }


    @Override
    public void send() {
        if (notificationSender != null){
            notificationSender.send();
        }
        System.out.println("Sending Push Notification");
    }
}
