package missao4;

public class Principal {

    public static void main(String[] args) {

        Tecnico tecnico1 = new TecnicoHardware();
        tecnico1.setNome("Carlos");
        tecnico1.setEspecialidade("Hardware");

        Tecnico tecnico2 = new TecnicoSoftware();
        tecnico2.setNome("Ana");
        tecnico2.setEspecialidade("Software");

        System.out.println("=== TÉCNICO 1 ===");
        System.out.println("Nome: " + tecnico1.getNome());
        System.out.println("Especialidade: " + tecnico1.getEspecialidade());
        tecnico1.realizarAtendimento();

        System.out.println();

        System.out.println("=== TÉCNICO 2 ===");
        System.out.println("Nome: " + tecnico2.getNome());
        System.out.println("Especialidade: " + tecnico2.getEspecialidade());
        tecnico2.realizarAtendimento();
    }
}
