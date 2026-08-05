package solid.srp.good.services;

public class UserValidationService {
    public boolean emailValidator(String email) {
        return email != null && email.contains("@") && email.contains(".");
    }
}
