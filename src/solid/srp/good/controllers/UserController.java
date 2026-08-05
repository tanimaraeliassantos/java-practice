package solid.srp.good.controllers;

import solid.srp.good.models.User;
import solid.srp.good.services.UserService;

public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    public User createUser(Long id, String userName, String email, String rawPassword) {
        System.out.println("--- API HTTP recibida petición post users");

        User createdUser = userService.registerUser(id, userName, email, rawPassword);

        System.out.println(" respondiendo 201 CREATED");

        return createdUser;
    }
}
