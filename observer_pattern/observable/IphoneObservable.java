package observer_pattern.observable;

import observer_pattern.observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class IphoneObservable implements Observable{
    int stock;
    List<Observer> observerList = new ArrayList<>();
    @Override
    public void add(Observer observer) {
        observerList.add(observer);

    }

    @Override
    public void remove(Observer observer) {
        observerList.remove(observer);

    }

    @Override
    public void notifySubScribers() {
        for (Observer o : observerList){
            o.update();
        }

    }

    @Override
    public void setStock(int stock){
        if (this.stock==0){
            notifySubScribers();
        }
        this.stock=stock;
    }

    @Override
    public String getName() {
        return "Iphone";
    }
}
