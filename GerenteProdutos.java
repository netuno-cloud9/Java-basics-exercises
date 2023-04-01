package Questao3;

import java.util.List;

public class GerenteProdutos {
    private List<IProdutoFabricado> produtosFabricados;
    private List<IProduto> produtosComprados;
    
    

public float getValorCompra(String nomeProduto) {
    for (IProduto produto : produtosComprados) {
        if (produto.getNome().equals(nomeProduto)) {
            return produto.getCusto();
        }
    }
    return 0;
}
    public List<String> ingredientes(String nomeProduto) {
        for (IProdutoFabricado produto : produtosFabricados) {
            if (produto.getNome().equals(nomeProduto)) {
                return produto.getIngredientes();
            }
       
}
    }
}
