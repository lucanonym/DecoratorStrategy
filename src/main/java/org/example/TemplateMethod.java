package org.example;

public abstract class TemplateMethod {

    public void print() {
        dash();
        System.out.println("Hallo, ich möchte immer ausgegeben werden");
        dash();
        smile();
        dash();
    }
    public abstract void smile();
    public abstract void dash();
}
