package org.example;

public abstract class BaseDecorator extends Notifier {
    private final Notifier wrappee;

    public BaseDecorator(Notifier wrappee) {
        this.wrappee = wrappee;
    }

    @Override
    public void send(String message) {
        wrappee.send(message);
    }

}
