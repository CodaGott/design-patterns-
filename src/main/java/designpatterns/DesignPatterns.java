package designpatterns;


import designpatterns.observer.NotificationManager;
import designpatterns.observer.PaymentEventLogger;
import designpatterns.observer.PaymentListener;
import designpatterns.observer.PaymentManager;

public class DesignPatterns {
    public static void main(String[] args) {
        PaymentManager paymentManager = new PaymentManager();

        PaymentListener p1 = new NotificationManager();
        paymentManager.registerPaymentListener(NotificationManager::new);

        PaymentListener p2 = new PaymentEventLogger();
        paymentManager.registerPaymentListener(p2);

        paymentManager.pay();

    }
}
