package solid.users;

public interface NotificationService {
    void sendMessage(User user, String message);
}