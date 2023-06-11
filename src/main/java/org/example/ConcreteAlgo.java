package org.example;

public class ConcreteAlgo extends TemplateMethod {
    @Override
    public void dash() {
        System.out.println("---------------------------");
    }
    @Override
    public void smile() {
        System.out.println(":)");
    }
}
