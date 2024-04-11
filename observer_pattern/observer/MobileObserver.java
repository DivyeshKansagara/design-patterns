package observer_pattern.observer;

import observer_pattern.observable.Observable;

public class MobileObserver implements Observer{
    final Observable observable;
    final String mobile;

    public MobileObserver(Observable observable, String mobile) {
        this.observable = observable;
        this.mobile = mobile;
    }

    @Override
    public void update() {
        System.out.println("sent notification on mobile"+mobile+" for "+observable.getName());

    }
}
