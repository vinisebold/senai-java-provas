import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Instancia objeto de Agenda
        Agenda agenda = new Agenda();

        // Boolean para verificar se o menu deve ser aberto ou ñ
        boolean isMenu = true;
        while (isMenu) {
            System.out.println("\n==================================");
            System.out.println("         MENU DE RESERVAS         ");
            System.out.println("==================================");
            System.out.println("  [1] - Adicionar reserva");
            System.out.println("  [2] - Remover reserva");
            System.out.println("  [3] - Exibir reservas");
            System.out.println("  [4] - Sair");
            System.out.println("==================================");

            // Escolher a opção do menu
            System.out.print("Opção de escolha: ");
            int op = sc.nextInt();

            // Limpar Buffer do Scanner
            sc.nextLine();

            switch (op) {
                case 1 -> agenda.addReserva(Utils.instanciarReserva(sc));
                case 2 -> {
                    System.out.println("\n=== REMOVER RESERVA ===");
                    System.out.print("Nome: ");
                    String nomeReserva = sc.nextLine();
                    agenda.deleteReservaNome(nomeReserva);
                }
                case 3 -> {
                    System.out.println("\n=== RESERVAS ===");
                    agenda.listReservas();
                }

                case 4 -> {
                    System.out.println("\nEncerrando o programa...");
                    isMenu = false;
                }
                default -> System.out.println("\n⚠ Opção inválida! Tente novamente.");
            }
        }
        sc.close();
    }
}
