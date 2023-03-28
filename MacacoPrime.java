
import java.util.Arrays;

public class MacacoPrime {
    private String nome;
    private String[] estomago;

    public MacacoPrime(String nome) {
        this.nome = nome;
        estomago = new String[3];
    }
    
    public void comer(String alimento){
        boolean cheio = true;
        for (int i = 0; i < estomago.length; i++) {
            if(estomago[i] == null){
                estomago[i] = alimento;
                cheio = false;
                break;
            }
        } if (cheio){
            System.out.println("Estomago cheio");
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
        MacacoPrime mamaco = new MacacoPrime("mamaco");
        mamaco.comer("Banana");
        mamaco.verEstomago();
        mamaco.comer("Maçã");
        mamaco.verEstomago();
        mamaco.comer("Pêra");
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
