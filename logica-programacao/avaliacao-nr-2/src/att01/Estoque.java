package att01;

import java.util.ArrayList;
import java.util.List;

public class Estoque {
    List<Produto> produtos;

    public Estoque() {
        this.produtos = new ArrayList<>();
    }

    public void adicionarProduto(Produto p) {
        produtos.add(p);
    }

    public void removerProdutoNome(String nome) {
        produtos.removeIf(produto -> produto.getNome().equalsIgnoreCase(nome));
    }

    public List<Produto> exibirEstoque() {
        if (produtos.isEmpty()) {
            System.out.println("Nenhum produto no estoque...");
        }

        return produtos;
    }

    @Override
    public String toString() {
        return "=== ESTOQUE ===\n" + produtos;
    }
}
