package observer;

import observable.StockObservable;

public class MobileNotificationAlertObserver implements NotificationAlertObserver {

    private final String user;
    private final StockObservable observable;

    public MobileNotificationAlertObserver(String user, StockObservable observable) {
        this.user = user;
        this.observable = observable;
    }

    @Override
    public void update() {
        pushNotification(user);
    }

    void pushNotification(String user) {
        System.out.println("\n Push Notification");
        System.out.println("Hello "+user + " "+observable.getStockCount()+" units of Iphone is currently available");
    }
}
