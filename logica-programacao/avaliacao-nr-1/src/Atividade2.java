import java.time.Duration;
import java.time.LocalTime;
import java.util.Scanner;

public class Atividade2 {
    public static void main(String[] args) {
        // Instancia Scanner
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Hora de entrada (ex: 08:00): ");
        LocalTime horarioEntrada = LocalTime.parse(sc.nextLine());
        System.out.print("Hora saída (ex: 17:30): ");
        LocalTime horarioSaida = LocalTime.parse(sc.nextLine());

        // Processamento
        Duration diferencaHorario = Duration.between(horarioEntrada, horarioSaida);
        long totalMinutos = diferencaHorario.toMinutes();
        long horas = Math.abs(totalMinutos / 60);
        long minutos = Math.abs(totalMinutos % 60);

        // Output
        System.out.println("Entrada: " + horarioEntrada + " Saída: " + horarioSaida + " Total trabalhado: " + horas + " horas " + minutos + " minutos");

        // Fecha Scanner
        sc.close();
    }
}
