package solid.lsp.good.models;

public class BookableFlight extends Flight {
    public BookableFlight(String id) {
        this.id = id;
    }

    @Override
    public double getPrice() {
        return 100.0;
    }

    public void book() {
        System.out.println("Reservando vuelo " + id);
    }
}
