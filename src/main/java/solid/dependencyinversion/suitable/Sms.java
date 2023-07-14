package main.java.solid.dependencyinversion.suitable;

public class Sms implements Message {


    @Override
    public void sendMessage() {
        sendSms();
    }
    private void sendSms(){
        System.out.println("send Sms");
    }

}
