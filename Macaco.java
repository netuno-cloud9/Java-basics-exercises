
import java.util.ArrayList;
import java.util.List;

/*
Desenvolva uma classe Macaco que possua os atributos nome e estomago (será uma lista)

Métodos: comer(alimento), verEstomago(), digerir().

Faça um programa criando dois macacos, alimentando-os com 3 alimentos diferentes e 
verificando o conteúdo do estomago a cada refeição.

Experimente fazer com que um macaco se alimente do outro, é possível fazer um macaco 
canibal?
*/
public class Macaco {
    private String nome;
    private List<String> estomago;

    public Macaco(String nome) {
        this.nome = nome;
        estomago = new ArrayList<String>();
    }
    
    public void comer(String alimento){
        estomago.add(alimento);
    }
    
    public void verEstomago(){
        System.out.println(estomago);
    }
    
    public void digerir(){
        estomago.remove(0);
    }
    
    public static void main(String[] args) {
        Macaco mamaco = new Macaco("mamaco");
       
        
        Macaco cezar = new Macaco("cezar");
        mamaco.comer("Banana");
        mamaco.verEstomago();
        mamaco.comer("Maçã");
        mamaco.verEstomago();
        mamaco.comer("Pêra");
        mamaco.verEstomago();
        cezar.comer("Banana");
        cezar.verEstomago();
        cezar.comer("Maçã");
        cezar.verEstomago();
        cezar.comer("Pêra");
        cezar.verEstomago();
        cezar.comer(mamaco.nome);
        cezar.verEstomago();
    }
}
