package observer_pattern.observer;

import observer_pattern.observable.Observable;

public class EmailObserver implements Observer{
    final Observable observable;
    final String email;

    public EmailObserver(Observable observable, String mobile) {
        this.observable = observable;
        this.email = mobile;
    }

    @Override
    public void update() {
        System.out.println("sent notification on email"+email+" for "+ observable.getName());
    }
}
