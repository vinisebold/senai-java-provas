import java.time.LocalDate;
import java.time.LocalTime;

public class Reserva {
    private String nomeReserva;
    private LocalDate dataReserva;
    private LocalTime horaReserva;

    public Reserva(String nomeReserva, LocalDate dataReserva, LocalTime horaReserva) {
        this.nomeReserva = nomeReserva;
        this.dataReserva = dataReserva;
        this.horaReserva = horaReserva;
    }

    public String getNomeReserva() {
        return nomeReserva;
    }

    @Override
    public String toString() {
        return "Nome: " + nomeReserva + "\n" +
                "Data: " + dataReserva + "\n" +
                "Hora: " + horaReserva + "\n" +
                "-----------------";
    }
}
