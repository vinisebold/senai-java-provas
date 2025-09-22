import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Atividade1 {
    public static void main(String[] args) {
        // Abre Scanner
        Scanner sc = new Scanner(System.in);

        // Variáveis
        String nomeCliente, produtoComprado;
        int quantidade;
        double precoUnitario;
        LocalDateTime agora = LocalDateTime.now();

        // Input
        System.out.print("Nome do cliente: ");
        nomeCliente = sc.nextLine();

        System.out.print("Produto comprado: ");
        produtoComprado = sc.nextLine();

        System.out.print("Quantidade: ");
        quantidade = sc.nextInt();

        System.out.print("Preço unitário: ");
        precoUnitario = sc.nextDouble();

        // Processamento
        double precoTotal = precoUnitario * quantidade;
        String dataFormatada = agora.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));

        // Output
        System.out.println("=== RECIBO DE COMPRA ===");
        System.out.println("Cliente: " + nomeCliente);
        System.out.println("Produto " + produtoComprado + " Quantidade: " + quantidade + " Preço Unitário: R$" + precoUnitario + " Total: R$" + precoTotal);
        System.out.println("Emitido em: " + dataFormatada);


        // Fecha Scanner
        sc.close();
    }
}