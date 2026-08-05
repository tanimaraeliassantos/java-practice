package solid.srp.good.services;

public class PasswordService {
    public String hashPassword(String rawPassword) {
        return "HASHED_" + rawPassword;
    }
}
