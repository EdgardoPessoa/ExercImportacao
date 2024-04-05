package Source.Entidades;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ProdutosUsados extends Produtos {
    private LocalDate fabricacao;

    public ProdutosUsados(String nome, double preco, LocalDate fabricacao) {
        super(nome, preco);
        this.fabricacao = fabricacao;
    }

    public LocalDate getFabricacao() {
        return fabricacao;
    }

    public void setFabricacao(LocalDate fabricacao) {
        this.fabricacao = fabricacao;
    }

    public String getEtiquetaPreco() {
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return String.format("Produto: %s (usado), Preço: R$ %.2f (Fabricado em: %s).", getNome(), getPreco(), fabricacao.format(dateFormatter));
    }
}
