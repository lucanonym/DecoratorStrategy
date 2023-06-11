package org.example;

public class Main {
    public static void main(String[] args) {
        Notifier notifier = new Notifier();
        BaseDecorator decorator = new DashDecorator(notifier);
        decorator = new SmileyDecorator(decorator);
        decorator = new DashDecorator(decorator);
        decorator.send("Hallo ich bin ein Smiley");
        TemplateMethod temp = new ConcreteAlgo();
        temp.print();
    }
}