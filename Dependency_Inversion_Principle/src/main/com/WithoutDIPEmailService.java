package main.com;
// Example violating DIP
class WithoutDIPEmailService {
    public void sendEmail(String recipient, String message) {
        // Send email logic
    }
}

class UserService {
    private WithoutDIPEmailService emailService;

    public UserService() {
        this.emailService = new WithoutDIPEmailService(); // Dependency created inside the class
    }

    public void notifyUser(String username, String message) {
        // Notify logic
        emailService.sendEmail(username + "@example.com", message);
    }
}
