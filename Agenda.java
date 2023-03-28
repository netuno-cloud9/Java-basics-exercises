
import java.util.Arrays;

public class Agenda {
    private Pessoa[] pessoas;
    
    public Agenda(){
        pessoas = new Pessoa[10];
    }
    
    public void armazenaPessoa(String nome, int idade, double altura){
        Pessoa a = new Pessoa(nome, idade, altura);
        boolean cheio = true;
        for (int i = 0; i < pessoas.length; i++) {
            if(pessoas[i] == null){
                pessoas[i] = a;
                cheio = false;
                System.out.println("Pessoa adicionada com sucesso");
                break;
            }
        }
        if(cheio){
            System.out.println("Agenda cheia");
        }
    }
    
    public void removePessoa(String nome){
        boolean achei = false;
        for (int i = 0; i < pessoas.length; i++) {
            if(pessoas[i].getNome().equals(nome)){
                pessoas[i] = null;
                achei = true;
                System.out.println("Pessoa removida com sucesso");
                break;
            }
        }
        if(!achei){
            System.out.println("Pessoa não encontrada");
        }
    }
    
    public int buscaPessoa(String nome){
        for (int i = 0; i < pessoas.length; i++) {
            if(pessoas[i].getNome().equals(nome)){
                return i;
            }
        }
            return 999999;
    }
    
    public void imprimeAgenda(){
        System.out.println(Arrays.toString(pessoas));
    }
    
    public void imprimePessoa(int index){
        System.out.println(pessoas[index]);
    }
    
    public static void main(String[] args) {
        Agenda a = new Agenda();
        a.armazenaPessoa("fulano", 18, 185);
        a.armazenaPessoa("fulano1", 18, 185);
        a.armazenaPessoa("fulano2", 18, 185);
        a.armazenaPessoa("fulano3", 18, 185);
        a.armazenaPessoa("fulano4", 18, 185);
        a.armazenaPessoa("fulano5", 18, 185);
        a.armazenaPessoa("fulano6", 18, 185);
        a.armazenaPessoa("fulano7", 18, 185);
        a.armazenaPessoa("fulano8", 18, 185);
        a.armazenaPessoa("fulano9", 18, 185);
        a.armazenaPessoa("fulano10", 18, 185);
        
        System.out.println(a.buscaPessoa("fulano8"));
        a.removePessoa("fulano9");
        a.imprimePessoa(8);
        a.imprimeAgenda();
    }
}
