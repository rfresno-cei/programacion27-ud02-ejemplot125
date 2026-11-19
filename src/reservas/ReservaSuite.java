package reservas;

public class ReservaSuite extends Reserva {
    private double suplemento;
    public enum Tipo {SILVER, GOLD, PLATINUM}
    private Tipo tipo;

    public ReservaSuite(String nombreHotel, String nombreCliente, double precioPorNoche, int numNoches, double suplemento, Tipo tipo) {
        super(nombreHotel, nombreCliente, precioPorNoche, numNoches);
        this.suplemento = suplemento;
        this.tipo = tipo;
    }

    public ReservaSuite() {
    }

    public double getSuplemento() {
        return suplemento;
    }

    public void setSuplemento(double suplemento) {
        this.suplemento = suplemento;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public double getPrecioTotal() {
        return this.getPrecioPorNoche() * this.getNumNoches() + this.suplemento;
        //return this.calcularPrecio() + this.suplemento;
    }

    public String toString() {
        //Reserva de suite <tipo> (<precioPorNoche> €/noche)
        return "Reserva de suite " + this.tipo + " (" + this.getPrecioPorNoche() +
                " €/noche)";
    }
}
