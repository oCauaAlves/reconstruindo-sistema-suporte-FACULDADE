package missao5;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Chamado[] chamados = new Chamado[3];

        for (int i = 0; i < chamados.length; i++) {
            System.out.println("\n--- Cadastro do Chamado " + (i + 1) + " ---");

            int numero;

            while (true) {
                try {
                    System.out.print("Número do chamado: ");
                    numero = Integer.parseInt(scanner.nextLine());
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Erro: digite um número válido.");
                }
            }

            System.out.print("Descrição do problema: ");
            String descricao = scanner.nextLine();

            int opcao;

            do {
                System.out.println("\nEscolha o técnico responsável:");
                System.out.println("1 - Carlos (Hardware)");
                System.out.println("2 - Ana (Software)");
                System.out.print("Opção: ");

                try {
                    opcao = Integer.parseInt(scanner.nextLine());
                } catch (NumberFormatException e) {
                    opcao = 0;
                    System.out.println("Digite apenas 1 ou 2.");
                }

                if (opcao != 1 && opcao != 2) {
                    System.out.println("Opção inválida! Tente novamente.");
                }

            } while (opcao != 1 && opcao != 2);

            Tecnico tecnico;

            if (opcao == 1) {
                tecnico = new TecnicoHardware();
                tecnico.setNome("Carlos");
                tecnico.setEspecialidade("Hardware");
            } else {
                tecnico = new TecnicoSoftware();
                tecnico.setNome("Ana");
                tecnico.setEspecialidade("Software");
            }

            Chamado chamado = new Chamado();
            chamado.setNumero(numero);
            chamado.setDescricao(descricao);
            chamado.setStatus("Aberto");
            chamado.setTecnico(tecnico);

            chamados[i] = chamado;

            System.out.println("\nChamado cadastrado com sucesso!");
            System.out.println("Técnico responsável: " + tecnico.getNome());
        }

        System.out.println("\n===== LISTA DE CHAMADOS =====");

        for (Chamado chamado : chamados) {
            System.out.println("\nNúmero: " + chamado.getNumero());
            System.out.println("Descrição: " + chamado.getDescricao());
            System.out.println("Status: " + chamado.getStatus());
            System.out.println("Técnico: " + chamado.getTecnico().getNome());
            System.out.println("Especialidade: " + chamado.getTecnico().getEspecialidade());
        }

        System.out.println("\nTotal de chamados criados: " + Chamado.getTotalChamados());

        scanner.close();
    }
}
