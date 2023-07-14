package main.java.solid.dependencyinversion.suitable;

import java.util.List;

public class Notification {

    private List<Message> messageList;

    public Notification(List<Message> messageList) {
        this.messageList = messageList;
    }

    public void sender() {
        for (Message message : messageList) {
            message.sendMessage();
        }
    }
}
