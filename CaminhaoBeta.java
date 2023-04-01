import java.util.List;

public class CaminhaoBeta extends Caminhao {

    public CaminhaoBeta(List<Pluviometro> pluviometros, String tipo) {
        super(pluviometros, tipo);
    }

    public void inserePluviometro(Pluviometro pluviometro) {
        boolean pluviometroJaCarregado = false;
        for (Pluviometro p : pluviometros) {
            if (p.getTipo().equals(pluviometro.getTipo())) {
                pluviometroJaCarregado = true;
                break;
            }
        }
        if (!pluviometroJaCarregado) {
            pluviometros.add(pluviometro);
        }
    }
}
