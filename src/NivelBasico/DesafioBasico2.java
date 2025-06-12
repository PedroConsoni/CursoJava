// Define o pacote que a classe está
package NivelBasico;

// Importei a classe Scanner para a entrada de dados do usuário
import java.util.Scanner;

// Iniciando a classe principal
public class DesafioBasico2 {

    // Declarando o método main que executa o programa
    public static void main(String[] args) {

    // Instanciei a classe Scanner para ler as entradas de dados do usuário
    Scanner scanner = new Scanner(System.in);

    // Defini o tamanho máximo de pessoas que podem ser cadastradas
    int numeroMax = 10;

    // Criei o array pessoas e utilizei a variável numeroMax como tamanho desse array
    String[] pessoas = new String[numeroMax];

    // Contador de quanto pessoas já foram cadastradas
    int pessoasCadastradas = 0;

    // Variável que armazena a opção escolhida pelo usuário
    int opcao = 0;

    // Estrutura de repetição que continua até o usuário escolher a opção '3' (sair)
    while (opcao != 3) {
        // Exibe o menu de opções para o usuário
        System.out.println("\n===== Menu Ninja =====");
        System.out.println("1. Cadastrar pessoas");
        System.out.println("2. Listar pessoas cadastradas");
        System.out.println("3. Sair");
        System.out.print("Escolha uma opção: ");

        // Lê a opção escolhida pelo usuário
        opcao = scanner.nextInt();

        // Consome a quebra de linha deixada pelo nextInt() para evitar bugs na leitura seguinte
        scanner.nextLine();


        // Estrutura de controle que executa ações com base na opção escolhida pelo usuário
        switch (opcao) {
            case 1:
                // Verifica se há mais espaços no array para cadastrar mais pessoas
                if (pessoasCadastradas < numeroMax) {
                    System.out.println("Digite o nome da pessoa que deseja cadastrar");
                    //Lê o nome digitado pelo usuário e ar
                    String nomePessoa = scanner.nextLine();
                    // Insere o nome digitado pelo usuário e armazenado na váriavel 'nomePessoa' no array 'pessoas', usando o índice atual de 'pessoasCadastradas'
                    pessoas[pessoasCadastradas] = nomePessoa;
                    // Avança o índice para a próxima posição do array, indicando que uma nova pessoa foi cadastrada
                    pessoasCadastradas++;
                    System.out.println("Pessoa cadastrada com sucesso");
                } else {
                    // Caso o array já esteja cheio
                    System.out.println("A lista está cheia");
                }
                break;

            // Caso o usuário escolha a opção '2', será exebido a lista de pessoas cadastradas
            case 2:
                // Verifica se há alguma pessoa cadastrada
                if (pessoasCadastradas != 0) {
                    System.out.println("============= Lista de pessoas cadastradas =============");
                    // Percorre todo array 'pessoas' e imprime o nome armazenado em cada sposição
                    for (int i = 0; i < pessoasCadastradas; i++) {
                        System.out.println(pessoas[i]);
                    }
                } else {
                    // Caso não haja ninguém cadastrado ainda
                    System.out.println("A lista está vazia.");
                }
                break;

            // Caso o usuário escolha '3' o programa será finalizado
            case 3:
                System.out.println("Programa finalizado");
                break;

            // Caso o usuário digite uma opção inválida
            default:
                System.out.println("Essa opção é inválida.");
                break;
            }
        }

    // Fecha o objeto Scanner para liberar recursos do sistema
    scanner.close();
    }
}
