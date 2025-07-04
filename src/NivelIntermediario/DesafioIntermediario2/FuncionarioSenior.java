package NivelIntermediario.DesafioIntermediario2;

public class FuncionarioSenior extends FuncionarioJunior implements  Trabalho {

    String posGraduacao;

    private Setor setor;

    @Override
    public void mostrarInformacoes() {
        super.mostrarInformacoes();
        System.out.println("Pós graduação: " + posGraduacao);
    }

    @Override
    public void executarTarefa() {
        System.out.println("O funcionário " + nome + " tem " + idade + " anos, se graduou em " + graduacao + " e se pós graduou em " + posGraduacao);
    }

    @Override
    public void mostrarSetor() {
        super.mostrarSetor();
    }

    public FuncionarioSenior(String nome, int idade, String graduacao, Setor setor, String posGraduacao) {
        super(nome, idade, graduacao, setor);
        this.posGraduacao = posGraduacao;
    }

    public FuncionarioSenior() {
    }
}
