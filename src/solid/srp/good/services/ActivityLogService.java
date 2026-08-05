package solid.srp.good.services;

import solid.srp.good.models.User;

public class ActivityLogService {
    public void logUserActivity(User user, String action) {
        System.out.println("LOG de " + user.getUsername() + ": " + action);
    }
}
