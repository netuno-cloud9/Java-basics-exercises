package Questao3;

import java.util.List;

public class ProdutosFabricados implements IProdutoFabricado {
    private String nome;
    private List<IProduto> listaingredientes;
    
    public ProdutosFabricados(String nome, List<IProduto> ingredientes) {
        this.nome = nome;
        this.listaingredientes = ingredientes;
        
    }
    
    @Override
    public String getNome() {
        return nome;
    }
    
    @Override
    public int getNumeroIngredientes() {
        return listaingredientes.size();
    }
    
    public IProduto getIngredientes(int numero) {
        return listaingredientes.get(numero);
    }
    
    @Override
    public float getCusto() {
        float custoTotal = 0;
        for (IProduto i : listaingredientes) {
            custoTotal += i.getCusto();
        }
        return custoTotal;
    }

}
