package encapsulacion;

public class User {
    // Atributos
    private final String id;
    private final String email;
    private boolean primeMember;
    private int loyaltyPoints;

    // Constructor
    public User(String id, String email, boolean primeMember, int loyaltyPoints) {
        if (email == null || !email.contains("@")) {
            throw new IllegalArgumentException("Email inválido");
        }
        // Asignar a atributos de la nueva instancia
        this.id = id;
        this.email = email;
        this.primeMember = false;
        this.loyaltyPoints = 0;
    }

    // Métodos propios
    public void subscribeToPrime() {
        this.primeMember = true;
    }

    public void addLoyaltyPoints(int points) {
        if (points < 0)
            throw new IllegalArgumentException("Puntos no pueden ser negativos");
        this.loyaltyPoints += points;
    }

    public boolean canRedeemPoints(int required) {
        return this.loyaltyPoints >= required;
    }

    // Getters
    public String getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public boolean isPrimeMember() {
        return primeMember;
    }

    public int getLoyaltyPoints() {
        return loyaltyPoints;
    }
}
