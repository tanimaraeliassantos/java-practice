package solid.srp.good.models;

public class User {
    private final Long id;
    private final String userName;
    private String email;
    private String password;

    // Constructor
    public User(Long id, String userName, String email, String password) {
        this.id = id;
        this.userName = userName;
        this.email = email;
        this.password = password;
    }

    // Getters
    public Long getId() {
        return id;
    }

    public String getUsername() {
        return userName;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
