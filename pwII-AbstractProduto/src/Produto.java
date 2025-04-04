public abstract class Produto {
    private String descricao;
    private String genero;
    private int estoqueDisponivel;
    private double precoCusto;
    private double precoVenda;

    public abstract void listarProdutos();

    public abstract void calcularPrecoVenda();
}
