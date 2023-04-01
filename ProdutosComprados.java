package Questao3;


public class ProdutosComprados implements IProduto {
    private String nome;
    private float valorCompra;
    
    public ProdutosComprados(String nome, float valorCompra) {
        this.nome = nome;
        this.valorCompra = valorCompra;
    }
    
    @Override
    public String getNome() {
        return nome;
    }
    
    @Override
    public float getCusto() {
        return valorCompra;
    }
}
