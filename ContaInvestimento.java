
/*
Faça uma classe ContaInvestimento que seja semelhante a classe
ContaCorrente, com a diferença de que se adicione um atributo
taxaJuros. Forneça um método adicioneJuros() que adicioneJuros
a conta. Em seguida, para testar a classe, escreva um programa
que construa uma contaInvestimento com saldo inicial de 1000 
reais e uma taxa de juros de 10%. Depois aplique o método 
adicioneJuros() cinco vezes e mostre o saldo resultante.
 */
public class ContaInvestimento {
    private String nConta;
    private String nome;
    private double saldo;
    private double taxaJuros;

    public ContaInvestimento(String nConta, String nome, double saldo, double taxaJuros) {
        this.nConta = nConta;
        this.nome = nome;
        this.saldo = saldo;
        this.taxaJuros = taxaJuros;
    }

    public String getnConta() {
        return nConta;
    }

    public String getNome() {
        return nome;
    }

    public double getSaldo() {
        return saldo;
    }
    
    public void depositar(double valor){
        if(valor > 0){
            saldo += valor;
        }
    }
    
    public void sacar(double valor){
        if(valor > 0 && valor <= saldo){
            saldo -= valor;
        } else {
            System.out.println("Você é pobre!");
        }
    }
    
    public void adicionaJuros(){
        saldo += saldo * taxaJuros / 100;
    }
    
    public static void main(String[] args) {
        ContaInvestimento c = new ContaInvestimento("826492", "fulano", 1000, 10);
        for (int i = 0; i < 5; i++) {
            c.adicionaJuros();
            System.out.println(c.getSaldo());
        }
        
    }
}
