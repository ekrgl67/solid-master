package main.java.solid.dependencyinversion.suitable;

public class Email implements Message {

    @Override
    public void sendMessage() {
        sendEmail();
    }

    private void sendEmail(){
        System.out.println("send Email");
    }
}
