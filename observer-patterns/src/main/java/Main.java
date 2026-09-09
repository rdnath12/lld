import observable.*;
import observer.*;

class Main{
    public static void main(String[] args) {
        StockObservable stockObservable = new IphoneStockObservableImpl();

        NotificationAlertObserver emailAlertObserver = new EmailNotificationAlertObserver("abc@gmail.com",stockObservable);
        NotificationAlertObserver mobileAlertObserver = new MobileNotificationAlertObserver("John",stockObservable);

        stockObservable.add(emailAlertObserver);
        stockObservable.add(mobileAlertObserver);

        stockObservable.setStockCount(10);
        stockObservable.setStockCount(0);

        stockObservable.remove(mobileAlertObserver);
        stockObservable.setStockCount(10);
    }
}