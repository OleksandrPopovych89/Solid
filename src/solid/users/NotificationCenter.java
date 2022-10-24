package solid.users;

public class NotificationCenter {
    public void notify(User user, String message,
                       NotificationService service) {
// some logic
        service.sendMessage(user, message);
    }
}
