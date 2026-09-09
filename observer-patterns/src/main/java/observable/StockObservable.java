package observable;

import observer.NotificationAlertObserver;

public interface StockObservable{
  void add(NotificationAlertObserver observer);
  void remove(NotificationAlertObserver observer);
  void setStockCount(int stockCount);
  int getStockCount();
  void notifyObservers();
}