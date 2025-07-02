package NivelIntermediario.DesafioIntermediario1;

public class Cliente {

    String nome;
    int idade;
    String email;
    String senha;
    String CPF;

    public void mostrarInformacoes() {
        System.out.println("O nome: " + nome);
        System.out.println("A idade: " + idade);
        System.out.println("O email: " + email);
        System.out.println("A senha: " + senha);
        System.out.println("O CPF: " + CPF);
    }
}

