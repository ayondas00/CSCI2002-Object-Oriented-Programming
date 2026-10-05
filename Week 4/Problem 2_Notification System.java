package JavaProject;

class BaseNotification {

    void send() {
        System.out.println("Sending notification");
    }
}

class EmailNotification extends BaseNotification {

    @Override
    void send() {
        System.out.println("Sending Email Notification");
    }
}

class SMSNotification extends BaseNotification {

    @Override
    void send() {
        System.out.println("Sending SMS Notification");
    }
}

public class Notification {

    public static void main(String[] args) {

        BaseNotification n;

        System.out.println("---- Email Notification ----");

        n = new EmailNotification();
        n.send();

        System.out.println("\n---- SMS Notification ----");

        n = new SMSNotification();
        n.send();
    }
}
