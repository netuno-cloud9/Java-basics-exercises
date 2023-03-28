
import java.util.ArrayList;

public class ItemOrcamentoComplexo extends ItemOrcamento {

    private ArrayList<ItemOrcamento> subItens;

    public ItemOrcamentoComplexo(String historico, float valor, ArrayList<ItemOrcamento> subItens) {
        super(historico, valor);
        this.subItens = subItens;
    }

    @Override
    public float getValor() {
        float valorTotal = super.getValor();
        valorTotal = subItens.stream().map(subItem -> subItem.getValor()).reduce(valorTotal, (accumulator, _item) -> accumulator + _item);
        return valorTotal;
    }

    public ItemOrcamento encontrarItem(String historico) {
        for (ItemOrcamento subItem : subItens) {
            if (subItem.getHistorico().equals(historico)) {
                return subItem;
            } else if (subItem instanceof ItemOrcamentoComplexo) {
                ItemOrcamento encontrado = ((ItemOrcamentoComplexo) subItem).encontrarItem(historico);
                if (encontrado != null) {
                    return encontrado;
                }
            }
        }
        return null;
    }

}
