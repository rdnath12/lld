package observable;

import java.util.ArrayList;
import java.util.List;
import observer.NotificationAlertObserver;

public class IphoneStockObservableImpl implements StockObservable {

    private int stockCount;
    private final List<NotificationAlertObserver> observers;

    public IphoneStockObservableImpl() {
        this.observers = new ArrayList<>();
    }

    public void add(NotificationAlertObserver observer) {
        this.observers.add(observer);
    }

    public void remove(NotificationAlertObserver observer) {
        this.observers.remove(observer);
    }

    public void notifyObservers() {
        for (NotificationAlertObserver observer : observers) {
            observer.update();
        }
    }

    @Override
    public void setStockCount(int stockCount) {
        this.stockCount = stockCount;

        if (stockCount != 0) {
            notifyObservers();
        }
    }

    public int getStockCount() {
        return this.stockCount;
    }
}
