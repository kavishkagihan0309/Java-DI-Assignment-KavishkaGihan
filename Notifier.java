package com.example.assignmentproject;

public interface Notifier {
    public void send(String message);
 }

class EmailNotifier implements Notifier {
    @Override
    public void send(String message) {
        System.out.println("Sending Email:"+message+"!");
    }
}
class SmsNotifier implements Notifier {
    @Override
    public void send(String message) {
        System.out.println("Sending SMS:"+message+"!");
    }
}
class AlertService {
    private final Notifier notifier;


    public AlertService(Notifier notifier) {
        this.notifier = notifier;
    }

    public void User(String message) {
        notifier.send(message);
    }
}