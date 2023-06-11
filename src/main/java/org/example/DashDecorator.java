package org.example;

public class DashDecorator extends BaseDecorator {
    public DashDecorator(Notifier notifier) {
        super(notifier);
    }
    public void send(String message) {
        super.send(message);
        dash();
    }
    public void dash() {
        System.out.println("-----------");
    }


}
