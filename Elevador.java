
public class Elevador {
    private int andarAtual, totalAndares, capacidade, qtdPessoas;

    public Elevador(int totalAndares, int capacidade) {
        this.andarAtual = 0;
        this.totalAndares = totalAndares;
        this.capacidade = capacidade;
        this.qtdPessoas = 0;
    }
    
    public void entrar(){
        if(qtdPessoas < capacidade){
            qtdPessoas += 1;
        } else {
            System.out.println("Tô cheio");
        }
    }
    
    public void sair(){
        if(qtdPessoas > 0){
            qtdPessoas -= 1;
        } else {
            System.out.println("Tô vazio");
        }
    }
    
    public void subir(){
        if(andarAtual < totalAndares){
            andarAtual += 1;
        } else{
            System.out.println("Pra alcançar a tropa vai levar um tempo");
        }
    }
    
    public void descer(){
        if(andarAtual > 0){
            andarAtual -= 1;
        } else {
            System.out.println("Na sombra do fundo do poço");
        }
    }

    public int getAndarAtual() {
        return andarAtual;
    }

    public void setAndarAtual(int andarAtual) {
        this.andarAtual = andarAtual;
    }

    public int getTotalAndares() {
        return totalAndares;
    }

    public void setTotalAndares(int totalAndares) {
        this.totalAndares = totalAndares;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public int getQtdPessoas() {
        return qtdPessoas;
    }

    public void setQtdPessoas(int qtdPessoas) {
        this.qtdPessoas = qtdPessoas;
    }
    
    public static void main(String[] args) {
        Elevador e = new Elevador(5, 8);
        for (int i = 0; i < 9; i++) {
            e.entrar();
        }
        for (int i = 0; i < 6; i++) {
            e.subir();
        }
        for (int i = 0; i < 6; i++) {
            e.descer();
        }
        for (int i = 0; i < 9; i++) {
            e.sair();
        }
    }
    
}
