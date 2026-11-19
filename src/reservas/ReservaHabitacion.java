package reservas;

public class ReservaHabitacion extends Reserva {
    private int numCamas;
    private boolean vistasAlMar;

    public ReservaHabitacion(String nombreHotel, String nombreCliente, double precioPorNoche, int numNoches, int numCamas, boolean vistasAlMar) {
        super(nombreHotel, nombreCliente, precioPorNoche, numNoches);
        this.numCamas = numCamas;
        this.vistasAlMar = vistasAlMar;
    }

    public ReservaHabitacion() {
    }

    public ReservaHabitacion(String nombreHotel, String nombreCliente, double precioPorNoche, int numNoches, boolean vistasAlMar) {
        super(nombreHotel, nombreCliente, precioPorNoche, numNoches);
        this.vistasAlMar = vistasAlMar;
        this.numCamas = 2;
    }

    public String toString() {
        //Reserva de habitación con <numCamas> camas (<precioPorNoche> €/noche)
        return "Reserva de habitación con " + this.numCamas + " camas (" +
                this.getPrecioPorNoche() + " €/noche)";
    }
}
