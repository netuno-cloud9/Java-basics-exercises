import java.util.List;

public class CaminhaoAlfa extends Caminhao{

    public CaminhaoAlfa(List<Pluviometro> pluviometros, String tipo) {
        super(pluviometros, tipo);
    }

    @Override
    public void inserePluviometro(Pluviometro pluviometro) {
         double pesoatual = 0;
         for (Pluviometro p : pluviometros) {
            if (p.getTipo().equals(pluviometro.getTipo())) {
                pesoatual+= pluviometro.getPeso();
                break;
            }
        }
    }
