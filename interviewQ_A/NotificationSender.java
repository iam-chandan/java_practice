package interviewQ_A;

abstract class Notification {
    String message;
    public Notification(String message) {
        this.message = message;
    }

    public void send() {
        System.out.println("Sending messages to : " + message);
    }

    abstract public void filterNotification();
}
class EmailNotification extends Notification {
    String message = "email@example.com";
    public EmailNotification(String message) {
        super(message);
    }

    @Override
    public void filterNotification() {
        System.out.println("Sending email to : " + message);
    }
}
class SMSNotification extends Notification {
    public SMSNotification(String message) {
        super(message);
    }
    @Override
    public void filterNotification() {
        System.out.println("Sending SMS to : " + message);
    }
}
public class NotificationSender {
    public static void main(String[] args) {
        Notification email = new EmailNotification("Hello");
        email.send();
        email.filterNotification();
        Notification sms = new SMSNotification("95326545");
        sms.send();
        sms.filterNotification();
    }
}
