package observer_pattern.observable;

import observer_pattern.observer.Observer;

public interface Observable {
    public void add(Observer observer);
    public void remove(Observer observer);
    public void notifySubScribers();
    public void setStock(int stock);
    public String getName();
}
