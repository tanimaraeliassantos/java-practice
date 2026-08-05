package solid.srp.good.services;

import solid.srp.good.models.User;
import solid.srp.good.repositories.UserRepository;

public class UserService {
    private final UserRepository userRepository;
    private final PasswordService passwordService;
    private final UserValidationService validationService;
    private final EmailService emailService;
    private final ActivityLogService logService;

    public UserService(UserRepository userRepository,
            PasswordService passwordService,
            UserValidationService validationService,
            EmailService emailService,
            ActivityLogService logService) {
        this.userRepository = userRepository;
        this.passwordService = passwordService;
        this.validationService = validationService;
        this.emailService = emailService;
        this.logService = logService;
    }

    public User registerUser(Long id, String userName, String email, String rawPassword) {
        if (!validationService.emailValidator(email)) {
            throw new IllegalArgumentException("Email no válido");
        }

        String hashedPassword = passwordService.hashPassword(rawPassword);
        User user = new User(id, userName, email, hashedPassword);

        userRepository.save(user);
        emailService.sendWelcomeEmail(user);
        logService.logUserActivity(user, "Registro de usuario exitoso");

        return user;
    }
}
