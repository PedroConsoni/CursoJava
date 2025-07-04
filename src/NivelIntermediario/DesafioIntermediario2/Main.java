package NivelIntermediario.DesafioIntermediario2;

public class Main {
    public static void main(String[] args) {

        FuncionarioJunior Carlos = new FuncionarioJunior("Carlos", 22, "Administração", Setor.Administração);
        Carlos.mostrarInformacoes();
        Carlos.executarTarefa();
        Carlos.mostrarSetor();

        System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------");

        FuncionarioJunior Felipe = new FuncionarioJunior("Felipe", 25, "Contabilidade", Setor.Contabilidade);
        Felipe.mostrarInformacoes();
        Felipe.executarTarefa();
        Felipe.mostrarSetor();

        System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------");

        FuncionarioSenior Gabriel = new FuncionarioSenior("Gabriel", 35, "Análise e Desenvolvimento de Sistemas", Setor.Tecnologia, "Engenharia de Software");
        Gabriel.mostrarInformacoes();
        Gabriel.executarTarefa();
        Gabriel.mostrarSetor();
    }
}
