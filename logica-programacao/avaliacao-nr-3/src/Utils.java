import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Utils {
    // Converte String -> LocalDate
    public static LocalDate parseData(String dataStr) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return LocalDate.parse(dataStr, formatter);
    }

    // Converte String -> LocalTime
    public static LocalTime parseHora(String horaStr) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
        return LocalTime.parse(horaStr, formatter);
    }

    public static Reserva instanciarReserva(Scanner sc) {
        String nomeReserva;
        LocalDate dataReserva;
        LocalTime horaReserva;

        System.out.println("\n=== ADICIONAR RESERVA ===");

        System.out.print("Nome da reserva: ");
        nomeReserva = sc.nextLine();

        System.out.print("Data da reserva (dd/mm/aaaa):  ");
        dataReserva = parseData(sc.nextLine());

        System.out.print("Hora da reserva (hh:mm): ");
        horaReserva = parseHora(sc.nextLine());

        return new Reserva(nomeReserva, dataReserva, horaReserva);
    }

}
