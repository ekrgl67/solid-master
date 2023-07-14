package main.java.solid.interfacesegragation.suitable;

public class Cat implements Runnable{

    @Override
    public void run() {
        System.out.println("run");
    }
}
