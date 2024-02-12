package designpatterns.decorator;

public class Main {
    public static void main(String[] args) {
//Todo:::==> the solution below is how it can be done
// without decorator design pattern
//        EmailSender es = new EmailSender();
//        SMSSender sms = new SMSSender();
//        PushNotification pn = new PushNotification();
//        es.send();
//        sms.send();
//        pn.send();

//Todo:::==> the solution below is how it can be done
// with decorator design pattern.

        NotificationSender s1 = new EmailSender(new SMSSender(null));
        NotificationSender s2 = new SMSSender(new EmailSender(null));
        s1.send();
        System.out.println("===========");
        s2.send();
    }
}
