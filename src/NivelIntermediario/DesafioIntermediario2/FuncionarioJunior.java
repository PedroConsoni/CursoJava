package NivelIntermediario.DesafioIntermediario2;

public class FuncionarioJunior implements Trabalho {

    String nome;
    int idade;
    String graduacao;

    private Setor setor;

    @Override
    public void mostrarInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Graduação: " + graduacao);
    }

    @Override
    public void executarTarefa() {
        System.out.println("O funcionário " + nome + " tem " + idade + " anos" + " e se graduou em " + graduacao);
    }

    public void mostrarSetor() {
        System.out.println("Setor: " + setor);
    }

    public FuncionarioJunior(String nome, int idade, String graduacao, Setor setor) {
        this.nome = nome;
        this.idade = idade;
        this.graduacao = graduacao;
        this.setor = setor;
    }

    public FuncionarioJunior() {
    }
}
