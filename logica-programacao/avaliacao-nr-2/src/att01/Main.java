package att01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Instancia objeto de estoque
        Estoque estoque = new Estoque();

        // Boolean para verificar se o menu deve ser aberto ou ñ
        boolean isMenu = true;
        while (isMenu) {
            System.out.println("- 1. Adicionar/Editar produto\n- 2. Remover produto\n- 3. Exibir estoque\n- 4. Sair");

            // Escolher a opção do menu
            System.out.print("\nOpção de escolha: ");
            int op = sc.nextInt();

            // Limpar Buffer do Scanner
            sc.nextLine();

            switch (op) {
                // Adicionar produto
                case 1 -> estoque.adicionarProduto(instanciarProduto());

                // Remover produto
                case 2 -> {
                    System.out.println("\n=== REMOVER PRODUTO ===");
                    System.out.print("Nome: ");
                    String nomeProduto = sc.nextLine();
                    estoque.removerProdutoNome(nomeProduto);
                }

                // Exibir estoque
                case 3 -> System.out.println(estoque.exibirEstoque());

                // Sair do programa
                case 4 -> isMenu = false;
            }

        }

        System.out.println("Fim programa");
        sc.close();
    }

    // Metodo para instanciar um produto
    static Produto instanciarProduto() {
        Scanner sc = new Scanner(System.in);

        String nome;
        int quantidade;
        double preco;

        System.out.println("\n=== ADICIONAR PRODUTO ===");

        System.out.print("Nome: ");
        nome = sc.nextLine();

        System.out.print("Quantidade: ");
        quantidade = sc.nextInt();

        System.out.print("Preco: ");
        preco = sc.nextDouble();

        return new Produto(nome, quantidade, preco);
    }
}
