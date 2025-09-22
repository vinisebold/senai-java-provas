package att02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Criar aluno
        System.out.print("Digite o nome do aluno: ");
        String nome = scanner.nextLine();
        Aluno aluno = new Aluno(nome);

        boolean continuar = true;

        while (continuar) {
            System.out.println("\n=== MENU ===");
            System.out.println("1 - Inserir notas de Matemática");
            System.out.println("2 - Inserir notas de História");
            System.out.println("3 - Exibir médias e sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1 -> {
                    boolean continuarMatematica = true;
                    while (continuarMatematica) {
                        System.out.print("Digite a nota de Matemática (valor negativo para parar): ");
                        double nota = scanner.nextDouble();
                        if (nota < 0) {
                            continuarMatematica = false;
                        } else {
                            aluno.adicionarNotaMatematica(nota);
                        }
                    }
                }

                case 2 -> {
                    boolean continuarHistoria = true;
                    while (continuarHistoria) {
                        System.out.print("Digite a nota de História (valor negativo para parar): ");
                        double nota = scanner.nextDouble();
                        if (nota < 0) {
                            continuarHistoria = false;
                        } else {
                            aluno.adicionarNotaHistoria(nota);
                        }
                    }
                }

                case 3 -> continuar = false;

                default -> System.out.println("Opção inválida!");
            }
        }
        System.out.println("\n=== RESULTADO FINAL ===");
        System.out.println("Aluno: " + aluno.getNome());
        System.out.printf("Média de Matemática: %.2f%n", aluno.calcularMediaMatematica());
        System.out.printf("Média de História: %.2f%n", aluno.calcularMediaHistoria());

        scanner.close();
    }
}
