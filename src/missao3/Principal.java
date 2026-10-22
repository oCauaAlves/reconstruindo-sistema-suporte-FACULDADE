package missao3;
public class Principal {

    public static void main(String[] args) {

        // Criando o computador
        Computador computador = new Computador();
        computador.setPatrimonio("PC001");
        computador.setModelo("Dell OptiPlex");
        computador.setSistemaOperacional("Windows 11");
        computador.setLigado(false);

        // Criando o técnico
        Tecnico tecnico = new Tecnico();
        tecnico.setNome("Carlos");
        tecnico.setEspecialidade("Hardware");

        // Criando o chamado
        Chamado chamado1 = new Chamado();
        chamado1.setNumero(1);
        chamado1.setDescricao("Computador não liga");
        chamado1.setStatus("Aberto");
        // Relacionando os objetos
        chamado1.setComputador(computador);
        chamado1.setTecnico(tecnico);

        // Exibindo as informações do chamado
        exibirChamado(chamado1);
    }

    public static void exibirChamado(Chamado chamado) {
        System.out.println("=== CHAMADO ===");
        System.out.println("Número: " + chamado.getNumero());
        System.out.println("Descrição: " + chamado.getDescricao());
        System.out.println("Status: " + chamado.getStatus());

        System.out.println("\n=== COMPUTADOR ===");
        System.out.println("Patrimônio: " + chamado.getComputador().getPatrimonio());
        System.out.println("Modelo: " + chamado.getComputador().getModelo());

        System.out.println("\n=== TÉCNICO ===");
        System.out.println("Nome: " + chamado.getTecnico().getNome());
        System.out.println("Especialidade: " + chamado.getTecnico().getEspecialidade());
    }
}
