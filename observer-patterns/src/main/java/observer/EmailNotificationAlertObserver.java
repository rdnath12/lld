package observer;

import observable.StockObservable;

public class EmailNotificationAlertObserver implements  NotificationAlertObserver{
    private final String email;
    private final StockObservable observable;

    public EmailNotificationAlertObserver(String email,StockObservable observable){
        this.email=email;
        this.observable=observable;
    }

    @Override
    public void update() {
       sendEmail(email);
    }

    void sendEmail(String email){
        System.out.println("\n Email Notification");
        System.out.println("Hello "+email + " "+observable.getStockCount()+" units of Iphone is currently available");
    }
}