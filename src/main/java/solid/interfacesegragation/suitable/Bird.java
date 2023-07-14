package main.java.solid.interfacesegragation.suitable;

public class Bird implements Flyable, Runnable {

    @Override
    public void fly() {
        System.out.println("fly");
    }

    @Override
    public void run() {
        System.out.println("run");
    }
}
