package Day_5;

interface EmailNotifier {
    default void sendNotification(String message) {
        System.out.println("Sending email notification: " + message);
    }
}

// Interface for SMS Notifications
interface SmsNotifier {
    default void sendNotification(String message) {
        System.out.println("Sending SMS notification: " + message);
    }
}

// User class implementing both notifiers
class User implements EmailNotifier, SmsNotifier {
    private String username;

    public User(String username) {
        this.username = username;
    }
    
 // Overriding the common default method
    @Override
    public void sendNotification(String message) {
        System.out.println("User " + username + " is receiving a notification.");
        // Calling specific default methods from interfaces
        EmailNotifier.super.sendNotification("Email for " + username + ": " + message);
        SmsNotifier.super.sendNotification("SMS for " + username + ": " + message);
    }
}
public class NotificationSystem {

	public static void main(String[] args) {
		 User user1 = new User("Alice");
	        user1.sendNotification("Your order has been shipped.");
	}

}
