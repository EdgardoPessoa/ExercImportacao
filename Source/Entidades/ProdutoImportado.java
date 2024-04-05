package Source.Entidades;

public class ProdutoImportado extends Produtos {
    private double taxa;

    public ProdutoImportado(String nome, double preco, double taxa) {
        super(nome, preco);
        this.taxa = taxa;
    }

    public double getTaxa() {
        return taxa;
    }

    public void setTaxa(double taxa) {
        this.taxa = taxa;
    }

    public double getPrecoTotal() {
        return getPreco() + taxa;
    }

    public String getEtiquetaPreco() {
        return String.format("Produto: %s, Preço: R$ %.2f (Taxa: R$ %.2f).", getNome(), getPrecoTotal(), taxa);
    }
}
