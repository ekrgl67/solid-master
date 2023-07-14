package main.java.solid.dependencyinversion.nonsuitable;

public class Notification {

    private Email email = new Email();
    private Sms sms = new Sms();

    public void sender(){
        email.sendEmail();
        sms.sendSms();
    }
}
