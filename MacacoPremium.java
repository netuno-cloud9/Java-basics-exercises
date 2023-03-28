
import java.util.Arrays;


public class MacacoPremium {
    private String nome;
    private Alimento[] estomago;

    public MacacoPremium(String nome) {
        this.nome = nome;
        estomago = new Alimento[5];
    }
    
    public void comer(String nome, double kcal){
        Alimento a = new Alimento(nome, kcal);
        boolean cheio = true;
        for (int i = 0; i < estomago.length; i++) {
            if(estomago[i] == null){
                estomago[i] = a;
                cheio = false;
                break;
            }
        } if(cheio){
            System.out.println("Buxin chei");
        }
    }
    
    public void verEstomago(){
        System.out.println(Arrays.toString(estomago));
    }
    
    public void digerir(){
        boolean vazio = true;
        for (int i = 0; i < estomago.length; i++) {
            if(estomago[i] != null){
                estomago[i] = null;
                vazio = false;
                break;
            }
        } if(vazio){
            System.out.println("Tô de larica");
        }
    }
    
    public static void main(String[] args) {
        MacacoPremium mamaco = new MacacoPremium("mamaco");
        mamaco.comer("Banana", 89);
        mamaco.verEstomago();
        mamaco.comer("Maçã", 52);
        mamaco.verEstomago();
        mamaco.comer("Pêra", 76);
        mamaco.verEstomago();
        mamaco.digerir();
        mamaco.verEstomago();
        mamaco.digerir();
        mamaco.verEstomago();
        mamaco.digerir();
        mamaco.verEstomago();
        mamaco.digerir();
        mamaco.verEstomago();
    
    }
    
    
}
