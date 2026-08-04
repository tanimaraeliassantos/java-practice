package solid.srp.bad;
public class Reservation {
    private String flightId;
    private String userId;
    private double price;

    public void save() {
        System.out.println("Guardando en BD");
    }

    public void sendConfirmationEmail() {
        System.out.println("Enviando email");
    }

    public double calculateTax() {
        return price * 0.21;
    }
}

//pseudocodigo
// Aquí tenemos una clase publica llamada Reservation
// que se define con tres atributos privados (que solo
// pueden ser accesados dentro de la clase). Dos de los
// atributos son de tipo texto y el último es de tipo
// numérico con decimales. Enseguida tenemos tres métodos
// públicos. Uno que simula el guardado de la reserva,
// no devuelve nada, imprime en consola “Guardando en BD”.
// Otro que simula envio de Email, no devuelve nada,
// imprime en consola Enviando Email. Y el último que sí
// devuelve el valor del impuesto (21%).

//PROBLEMA
// Aquí se viola el principio de la Responsabilidad Única (el S).
// Se mezclan datos con lógica de infraestructura. Lo ideal
// sería guardar aquí la reserva, y en un Repository
// guardar en BD, un Service para Email. 


