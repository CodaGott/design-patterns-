package designpatterns.observer;

@FunctionalInterface
public interface PaymentListener {

    // TODO::==>> The method of Listener objects are named in past terms,
    //  because that way it shows that the event has happened before the
    //  method gets called.
    void paymentMade();

}
