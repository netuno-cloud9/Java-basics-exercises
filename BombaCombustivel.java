
import java.util.*;

public class BombaCombustivel {

    private int id;
    private String tipo;
    private double valor, qtd;

    public BombaCombustivel(int id, String tipo, double valor, double qtd) {
        this.id = id;
        this.tipo = tipo;
        this.valor = valor;
        this.qtd = qtd;
    }

    public void abastecerPorValor(double reais) {
        double litros = reais / valor;
        if (litros <= qtd) {
            qtd -= litros;
            System.out.println("Abasteceu " + litros + " litros");
        } else {
            System.out.println("Tô vazia");
        }
    }

    public void abastecerPorLitro(double litros) {
        double reais = litros * valor;
        if (litros <= qtd) {
            qtd -= litros;
            System.out.println("Valor a ser pago R$" + reais);
        } else {
            System.out.println("Tô vazia");
        }
    }

    public int getId() {
        return id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getQtd() {
        return qtd;
    }

    public void setQtd(double qtd) {
        this.qtd = qtd;
    }

    public static void main(String[] args) {
        List<BombaCombustivel> posto = new ArrayList<BombaCombustivel>();
        Scanner s = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);
        int id = 0;
        while (true) {
            System.out.println("Digite 1 para registrar uma nova bomba"
                    + "\nDigite 2 para editar uma bomba existe");
            int escolha = sc.nextInt();
            if (escolha == 1) {
                System.out.println("Digite o tipo de combustível, o valor do litro e quantos\n"
                        + "litros a bomba terá inicialmente");
                String tipo = s.nextLine();
                double valor = sc.nextDouble();
                double qtd = sc.nextDouble();
                id++;
                BombaCombustivel b = new BombaCombustivel(id, tipo, valor, qtd);
                posto.add(b);
                System.out.println("Bomba registrada, o id é " + id++);
            } else if (escolha == 2) {
                System.out.println("Digite o id da bomba que deseja editar");
                escolha = sc.nextInt();
                for (BombaCombustivel b : posto) {
                    if (b.getId() == escolha) {
                        System.out.println("Digite 1 para editar o tipo"
                                + "\n2 para editar o valor"
                                + "\n3 para editar a quantidade"
                                + "\n4 para registrar abastecimento por valor"
                                + "\n5 para registrar abastecimento por litro");
                        escolha = sc.nextInt();
                        switch (escolha) {
                            case 1:
                                System.out.println("Digite o novo tipo");
                                String tipo = s.nextLine();
                                b.setTipo(tipo);
                                break;
                            case 2:
                                System.out.println("Digite o novo valor");
                                double valor = sc.nextDouble();
                                b.setValor(valor);
                                break;
                            case 3:
                                System.out.println("Digite o nova quantidade");
                                double qtd = sc.nextDouble();
                                b.setQtd(qtd);
                                break;
                            case 4:
                                System.out.println("De quantos reais foi o abastecimento");
                                double reais = sc.nextDouble();
                                b.abastecerPorValor(reais);
                                break;
                            case 5:
                                System.out.println("De quantos litros foi o abastecimento");
                                double litros = sc.nextDouble();
                                b.abastecerPorLitro(litros);
                                break;
                            default:
                                System.out.println("Tá troll");
                                break;
                        }
                    }
                }

            } else {
                System.out.println("Tá troll");
            }
        }
    }
}
