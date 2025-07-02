package NivelIntermediario.DesafioIntermediario1;

public class Cliente {

    String nome;
    int idade;
    String email;
    String senha;
    String CPF;

    public void mostrarInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Email: " + email);
        System.out.println("Senha: " + senha);
        System.out.println("CPF: " + CPF);
    }
}

