package reservas;

public class Reserva {
    private String nombreHotel;
    private String nombreCliente;
    private double precioPorNoche;
    private int numNoches;

    public Reserva(String nombreHotel, String nombreCliente, double precioPorNoche, int numNoches) {
        this.nombreHotel = nombreHotel;
        this.nombreCliente = nombreCliente;
        this.precioPorNoche = precioPorNoche;
        this.numNoches = numNoches;
    }

    public Reserva() {
    }

    public String getNombreHotel() {
        return nombreHotel;
    }

    public void setNombreHotel(String nombreHotel) {
        this.nombreHotel = nombreHotel;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public double getPrecioPorNoche() {
        return precioPorNoche;
    }

    public void setPrecioPorNoche(double precioPorNoche) {
        this.precioPorNoche = precioPorNoche;
    }

    public int getNumNoches() {
        return numNoches;
    }

    public void setNumNoches(int numNoches) {
        this.numNoches = numNoches;
    }

    public double calcularPrecio() {
        return this.precioPorNoche * this.numNoches;
    }

    public String toString() {
        //Reserva para <nombreCliente> (<precioPorNoche> €/noche)
        return "Reserva para " + this.nombreCliente + " (" + this.precioPorNoche +
                " €/noche)";
    }
}
