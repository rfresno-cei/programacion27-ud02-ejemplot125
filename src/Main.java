import reservas.ReservaHabitacion;
import reservas.ReservaSuite;

public class Main {
    public static void main(String[] args) {
        ReservaHabitacion rh = new ReservaHabitacion("Melia Lebreros", "Pepito", 60, 4, 2, false);
        System.out.println(rh.calcularPrecio());
        System.out.println(rh);
        ReservaSuite rs = new ReservaSuite("Melia Lebreros", "Laurita", 60, 7, 20, ReservaSuite.Tipo.GOLD);
        System.out.println(rs.getPrecioTotal());
        System.out.println(rs);
    }

    public static void ejercicio1() {
        String nombreHotel = "Melia Lebreros";
        String nombreCliente = "Pepito";
        double precioPorNoche = 50.5;
        int numeroNoches = 6;
        boolean desayunoIncluido = true;
        System.out.println("Reserva de " + nombreCliente + " en " + nombreHotel + ".");
        System.out.println(numeroNoches + " noches, " + precioPorNoche + " €/noche.");
        System.out.println("Desayuno incluido: " + desayunoIncluido);
    }

    public static void ejercicio2() {
        double precioPorNoche = 50.5;
        int numeroNoches = 6;
        double costeTotal = precioPorNoche * numeroNoches;
        System.out.println("Precio total: " + costeTotal + " €");
    }

    public static void ejercicio3() {
        double precioPorNoche = 50.5;
        int descuento = 10;
        double precioFinal = precioPorNoche - precioPorNoche * descuento / 100;
        // double precioFinal = precioPorNoche * (1 - descuento / 100.0);
        System.out.println("Precio original: " + precioPorNoche + " €");
        System.out.println("Descuento: " + descuento + "%");
        System.out.println("Precio final: " + precioFinal + " €");
    }
}