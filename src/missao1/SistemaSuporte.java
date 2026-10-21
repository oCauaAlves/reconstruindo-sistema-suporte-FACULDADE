package missao1;

public class SistemaSuporte {

    public static void main(String[] args) {

        String nomeSistema = "Sistema de Suporte";
        double versao = 1.0;
        String nomeTecnico = "Cauã Alves";
        int chamadosAbertos = 3;
        String statusSistema = "Ativo";

        System.out.println("Nome do sistema: " + nomeSistema);
        System.out.println("Versão: " + versao);
        System.out.println("Técnico: " + nomeTecnico);
        System.out.println("Chamados abertos: " + chamadosAbertos);
        System.out.println("Status do sistema: " + statusSistema);
        System.out.println();

        if (chamadosAbertos > 0) {
            System.out.println("Existem chamados aguardando atendimento");
            System.out.println("Total de " + chamadosAbertos + " chamados abertos!");
        } else {
            System.out.println("Nenhum chamado pendente");
        }
    }
}
