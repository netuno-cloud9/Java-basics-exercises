import java.util.List;

abstract class Caminhao extends Pluviometro{
    List<Pluviometro> pluviometros;

    public Caminhao(List<Pluviometro> pluviometros, String tipo) {
        super(tipo);
        this.pluviometros = pluviometros;
    }
    public abstract void inserePluviometro(Pluviometro p);
    
}
