package main.com;
// Example following DIP
interface NotificationService {
    void sendNotification(String recipient, String message);
}

class EmailService implements NotificationService {
    public void sendNotification(String recipient, String message) {
        // Send email logic
    }
}

class UserServicee {
    private NotificationService notificationService;

    public UserServicee(NotificationService notificationService) {
        this.notificationService = notificationService; // Dependency injected via constructor
    }

    public void notifyUser(String username, String message) {
        // Notify logic
        notificationService.sendNotification(username + "@example.com", message);
    }
}
