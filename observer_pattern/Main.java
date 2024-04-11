package observer_pattern;

import observer_pattern.observable.IphoneObservable;
import observer_pattern.observable.Observable;
import observer_pattern.observable.SamsungObservable;
import observer_pattern.observer.EmailObserver;
import observer_pattern.observer.MobileObserver;
import observer_pattern.observer.Observer;

public class Main {
    public static void main(String[] args){
        Observable iphone = new IphoneObservable();
        Observable samsung = new SamsungObservable();
        Observer observer1 = new MobileObserver(iphone,"9879692284");
        Observer observer2 = new EmailObserver(iphone,"xyz@gmail.com");
        Observer observer3 = new EmailObserver(iphone,"xyz1@gmail.com");
        Observer observer4 = new EmailObserver(samsung,"xyz4@gmail.com");
        Observer observer5 = new MobileObserver(samsung,"1");
        iphone.add(observer1);
        iphone.add(observer2);
        iphone.add(observer3);
        samsung.add(observer4);
        samsung.add(observer5);
        iphone.setStock(10);
        samsung.setStock(5);
    }
}
