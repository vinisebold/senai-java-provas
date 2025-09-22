import java.util.ArrayList;
import java.util.List;

public class Agenda {
    private List<Reserva> listaReservas;

    public Agenda() {
        listaReservas = new ArrayList<>();
    }

    public void addReserva(Reserva r) {
        listaReservas.add(r);
    }

    public void deleteReservaNome(String nome) {
        listaReservas.removeIf(reserva -> reserva.getNomeReserva().equalsIgnoreCase(nome));
    }

    public void listReservas() {
        if (listaReservas.isEmpty()) {
            System.out.println("Nenhum produto no estoque...");
        } else {
            for (Reserva r : listaReservas) {
                System.out.println(r);
            }
        }
    }
}
