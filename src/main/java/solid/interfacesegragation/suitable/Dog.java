package main.java.solid.interfacesegragation.suitable;

public class Dog implements Runnable,Barkable{
    @Override
    public void bark() {
        System.out.println("bark");
    }

    @Override
    public void run() {
        System.out.println("run");
    }
}
