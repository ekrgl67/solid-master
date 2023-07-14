package main.java.solid.interfacesegragation.nonsuitable;

public class Dog implements Animal{

    @Override
    public void fly() {
        System.out.println("fly");
    }

    @Override
    public void run() {
        System.out.println("run");
    }

    @Override
    public void bark() {
        System.out.println("bark");
    }
}
