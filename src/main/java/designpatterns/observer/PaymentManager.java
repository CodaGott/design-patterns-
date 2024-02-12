package designpatterns.observer;

import java.util.ArrayList;
import java.util.List;

public class PaymentManager {
    private final List<PaymentListener> paymentListeners = new ArrayList<>();


    public void pay(){
        paymentListeners.forEach(PaymentListener::paymentMade);
    }

    public void registerPaymentListener(PaymentListener p){
        paymentListeners.add(p);
    }

    public void unRegisterPaymentListener(PaymentListener p){
        paymentListeners.remove(p);
    }
}
