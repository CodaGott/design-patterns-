package designpatterns.adapter.main;

import designpatterns.adapter.dependency.DependencyNotificationSender;

public class AppNotificationSender implements NotificationSender{
    private final DependencyNotificationSender notificationSender;

    public AppNotificationSender(DependencyNotificationSender notificationSender) {
        this.notificationSender = notificationSender;
    }

    @Override
    public void sendNotification() {
        notificationSender.send();
    }
}
