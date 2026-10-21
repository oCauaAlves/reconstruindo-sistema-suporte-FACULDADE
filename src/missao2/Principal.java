package missao2;
public class Principal {

    public static void main(String[] args) {

        Computador computador1 = new Computador();
        computador1.patrimonio = "PC001";
        computador1.modelo = "Dell OptiPlex";
        computador1.sistemaOperacional = "Windows 11";
        computador1.ligado = false;

        Computador computador2 = new Computador();
        computador2.patrimonio = "PC002";
        computador2.modelo = "Lenovo ThinkCentre";
        computador2.sistemaOperacional = "Ubuntu Linux";
        computador2.ligado = false;

        computador1.ligar();
        computador1.exibirInformacoes();

        computador2.ligar();
        computador2.exibirInformacoes();

        computador1.desligar();
        computador2.desligar();
    }
}
