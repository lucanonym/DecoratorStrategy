package org.example;

public class SmileyDecorator extends BaseDecorator {
    public SmileyDecorator(Notifier notifier) {
        super(notifier);
    }

    public void send(String message) {
        super.send(message);
        sendSmiley();
    }
    public void sendSmiley() {
        System.out.println("-_-");
    }
}
