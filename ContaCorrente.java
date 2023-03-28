

/*
Crie uma classe que implementa uma conta corrente
Atributos: numero da conta, nome do titular, saldo
métodos: depositar(valor), sacar(valor)
OBS: Toda conta criada, tem saldo inicial 0
*/
public class ContaCorrente {
    private String nConta;
    private String nome;
    private double saldo;

    public ContaCorrente(String nConta, String nome) {
        this.nConta = nConta;
        this.nome = nome;
        this.saldo = 0;
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
}
