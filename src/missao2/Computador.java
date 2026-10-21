package missao2;
public class Computador {

    String patrimonio;
    String modelo;
    String sistemaOperacional;
    boolean ligado;

    public void ligar() {
        ligado = true;
        System.out.println(modelo + " ligado!");
    }

    public void desligar() {
        ligado = false;
        System.out.println(modelo + " desligado!");
    }

    public void exibirInformacoes() {
        System.out.println("Patrimônio: " + patrimonio);
        System.out.println("Modelo: " + modelo);
        System.out.println("Sistema Operacional: " + sistemaOperacional);
        System.out.println("Ligado: " + ligado);
        System.out.println("-------------------------");
    }
}
