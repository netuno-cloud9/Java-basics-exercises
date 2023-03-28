
import java.util.Scanner;

public class Tamagushi {

    private String nome;
    private int idade;
    private double fome, tedio;

    public Tamagushi(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
        this.fome = 100;
        this.tedio = 100;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getFome() {
        return fome;
    }

    public void setFome(double fome) {
        this.fome = fome;
    }

    public double getTedio() {
        return tedio;
    }

    public void setTedio(double tedio) {
        this.tedio = tedio;
    }

    public void brincar(double minutos) {
        tedio -= minutos;
        if (tedio < 0) {
            tedio = 0;
        }
    }

    public void alimentar(double qtd) {
        fome -= qtd;
        if (fome < 0) {
            fome = 0;
        }
    }

    public double getHumor() {
        return fome + tedio;
    }

    public static void main(String[] args) {
        Tamagushi t = new Tamagushi("Zezinho", 10);
        Scanner s = new Scanner(System.in);
        while (true) {
            System.out.println("Para brincar digite 1"
                    + "\nPara alimentar digite 2"
                    + "\nPara ver o humor digite 3");
            int escolha = s.nextInt();
            if(escolha == 1){
                System.out.println("Quantos minutos deseja brincar?");
                double minutos = s.nextDouble();
                t.brincar(minutos);
                System.out.println(t.getTedio());
            } else if(escolha == 2){
                System.out.println("Quanto de alimento irá fornecer?");
                double qtd = s.nextDouble();
                t.alimentar(qtd);
                System.out.println(t.getFome());
            } else if(escolha == 3){
                System.out.println(t.getHumor());
            }else {
                System.out.println("Tá trollando");
            }
        }
    }

}
