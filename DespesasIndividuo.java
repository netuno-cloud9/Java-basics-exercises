public class DespesasIndividuo {
    private String cpf;
    private DespesaMes[] despesasMes;
    private DespesaDia[] despesasDia;
    
    public DespesasIndividuo (String cpf, DespesaMes[] despesasMes, DespesaDia[] despesasDia) {
        this.cpf = cpf;
        this.despesasMes = despesasMes;
        this.despesasDia = despesasDia;
    }
    
    public String getCPF() {
        return cpf;
    }
    
    public DespesaMes totalizaMes(int mes) {
        float total = 0;
        for (DespesaMes despesa : despesasMes) {
            if (despesa.getMes() == mes) {
                total += despesa.getValor();
            }
        }
        for (DespesaDia despesa : despesasDia) {
            if (despesa.getMes() == mes) {
                total += despesa.getValor();
            }
        }
        return new DespesaMes(mes, total);
    }
}
