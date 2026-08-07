package solid.lsp.bad;

public class Flight {
    public double getPrice() {
        return 100.0;
    }

    public void book() {
        System.out.println("Reservando vuelo");
    }

    public class CancelledFlight extends Flight {
        @Override
        public void book() {
            throw new RuntimeException("No se puede reservar - vuelo cancelado");
        }
    }
}

//Aquí tenemos una clase con método getPrice y un método book
//Después tenemos una clase que extiende la clase Flight, sobrecarga el método
//book con un mensaje de error.
// El método funciona con Flight pero se rompe si es CancelledFlight.