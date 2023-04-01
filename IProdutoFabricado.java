package Questao3;

public interface IProdutoFabricado extends IProduto {
int getNumeroIngredientes();
IProduto getIngrediente (int numero);
}
