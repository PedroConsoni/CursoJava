package NivelIntermediario.DesafioIntermediario1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Criação do array de clientes de tamanho fixo
        int numeroMax = 10;
        Cliente[] clientes = new Cliente[numeroMax];

        // Inicializa as variáveis de controle
        int opcao = 0;
        int clientesCadastrados = 0;

        // Loop principal do menu com todas as suas opções
        while (opcao != 4) {
            System.out.println("============================================================================= MENU =============================================================================");
            System.out.println("1. Cadastrar clientes");
            System.out.println("2. Exibir informações dos clientes");
            System.out.println("3. Atualizar brinde do cliente VIP");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");

            // Lê a opção do usuário
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {

                // Cadastra os clientes
                case 1:
                    System.out.print("Escolha a opção A ( Cliente ) ou a opção B ( Cliente VIP ): ");
                    String escolhaCliente = scanner.nextLine();

                    // Verifica se ainda há espaço no array e se o usuário escolheu a opção "A"
                    if (clientesCadastrados < numeroMax && escolhaCliente.equalsIgnoreCase("A")) {

                        // Inicializa o objeto "novoCliente" e coleta seus dados
                        Cliente novoCliente = new Cliente();
                        System.out.print("Digite o nome do cliente: ");
                        novoCliente.nome = scanner.nextLine();
                        System.out.print("Digite a idade do cliente: ");
                        novoCliente.idade = scanner.nextInt();
                        scanner.nextLine();
                        System.out.print("Digite o email do cliente: ");
                        novoCliente.email = scanner.nextLine();
                        System.out.print("Digite a senha do cliente: ");
                        novoCliente.senha = scanner.nextLine();
                        System.out.print("Digite o CPF do cliente: ");
                        novoCliente.CPF = scanner.nextLine();

                        // Armazena o "novoCliente" no array e incrementa o contador
                        clientes[clientesCadastrados] = novoCliente;
                        clientesCadastrados++;

                    // Verifica se ainda há espaço no array e se o usuário escolheu a opção "B"
                    } else if (clientesCadastrados < numeroMax && escolhaCliente.equalsIgnoreCase("B")) {

                        // Inicializa o objeto "novoClienteVIP" e coleta seus dados
                        ClienteVIP novoClienteVIP = new ClienteVIP();
                        System.out.print("Digite o nome do cliente VIP: ");
                        novoClienteVIP.nome = scanner.nextLine();
                        System.out.print("Digite a idade do cliente VIP: ");
                        novoClienteVIP.idade = scanner.nextInt();
                        scanner.nextLine();
                        System.out.print("Digite o email do cliente VIP: ");
                        novoClienteVIP.email = scanner.nextLine();
                        System.out.print("Digite a senha do cliente VIP: ");
                        novoClienteVIP.senha = scanner.nextLine();
                        System.out.print("Digite o CPF do cliente VIP: ");
                        novoClienteVIP.CPF = scanner.nextLine();
                        System.out.print("Digite o brinde do cliente VIP: ");
                        novoClienteVIP.brinde = scanner.nextLine();

                        // Armazena o "novoClienteVIP" no array e incrementa o contador
                        clientes[clientesCadastrados] = novoClienteVIP;
                        clientesCadastrados++;

                    } else {
                        // Se a opção for inválida ou o array estiver cheio
                        System.out.println("Opção inválida");
                    }
                    break;

                case 2:

                    // Verifica se há pelo menos um cliente cadastrado
                    if (clientesCadastrados != 0) {
                        // Pergunta ao usuário se ele deseja visualizar as informações de cliente comuns ( A ) ou VIPs ( B )
                        System.out.print("Você deseja visualizar as informações da opção A ( Cliente ) ou opção B ( Cliente VIP ): ");
                        String escolhaVisualizar = scanner.nextLine();

                        boolean encontrou = false; // Usado para verificar se foi encontrado algum cliente do tipo escolhido
                        int contadorExibicao = 1; // Controla a numeração que será exibida na tela
                        int[] indiceReais = new int[clientesCadastrados]; // Armazena os índices reais do array para fazer o mapeamento com os números exibidos
                        int totalEncontrado = 0; // Conta quantos clientes do tipo escolhido foram encontrados

                        // Percorre todos os clientes cadastrados
                        for (int i = 0; i < clientesCadastrados; i++) {
                            // Caso o usuário tenha escolhido a opção "A", busca apenas clientes comuns ( não VIPs )
                            if (escolhaVisualizar.equalsIgnoreCase("A") && !(clientes[i] instanceof ClienteVIP)) {
                                System.out.println(contadorExibicao + ". " + clientes[i].nome); // Exibe a numeração corresponde ao cliente e seu nome ao lado
                                indiceReais[contadorExibicao - 1] = i; // Salva o índice real no array
                                contadorExibicao++; // Incrementa o número exibido
                                totalEncontrado++; // Conta esse cliente
                                encontrou = true;

                            // Caso o usuário tenha escolhido a opção "B", busca apenas clientes VIPs ( não comuns )
                            } else if (escolhaVisualizar.equalsIgnoreCase("B") && clientes[i] instanceof ClienteVIP) {
                                System.out.println(contadorExibicao + ". " + clientes[i].nome); // Exibe a numeração corresponde ao cliente VIP e seu nome ao lado
                                indiceReais[contadorExibicao - 1] = i; // Salva o índice real no array
                                contadorExibicao++; // Incrementa o número exibido
                                totalEncontrado++; // Conta esse cliente VIP
                                encontrou = true;

                            }
                        }
                        // Caso nenhum cliente do tipo escolhido tenha sido encontrado
                        if (!encontrou) {
                            System.out.println("Não há clientes do tipo do escolhido");
                            break;
                        }

                        // Pede para o usuário digitar o número que corresponde ao cliente que ele deseja visualizar as informações
                        System.out.print("Digite o número do cliente que você deseja visualizar as informações: ");
                        int numeroEscolhido = scanner.nextInt();
                        scanner.nextLine();

                        // Verifica se o número que foi escolhido é válido
                        if (numeroEscolhido >= 1 && numeroEscolhido <= totalEncontrado) {
                            // Use o número informado para acesssar o índice real no array clientes
                            int indiceReal = indiceReais[numeroEscolhido - 1];
                            Cliente clienteEscolhido = clientes[indiceReal];

                            // Verifica se o tipo do cliente é o mesmo da visualização
                            if ((escolhaVisualizar.equalsIgnoreCase("A") && !(clienteEscolhido instanceof ClienteVIP)) || (escolhaVisualizar.equalsIgnoreCase("B") && clienteEscolhido instanceof ClienteVIP)) {

                                // Exibe as informações detalhadas do cliente escolhido
                                System.out.println("================================================================================================================================================================");
                                clienteEscolhido.mostrarInformacoes();
                                System.out.println("================================================================================================================================================================");

                            } else {
                                System.out.println("O número selecionado não corresponde ao tipo de cliente escolhido");
                            }

                        } else {
                            System.out.println("Número inválido");
                        }

                    } else {
                        System.out.println("Nenhum cliente cadastrado");
                    }
                    break;

                case 3:

                    // Verifica se há pelo menos um cliente cadastrado
                    if (clientesCadastrados != 0) {
                        boolean encontrou = false; // Usado para verificar se foi encontrado algum cliente do tipo escolhido
                        int contadorAtualizar = 1; // Controla a numeração que será exibida na tela
                        int[] indicesAtualizar = new int[clientesCadastrados]; // Armazena os índices reais do array para fazer o mapeamento com os números exibidos
                        int totalAtualizar = 0; // Conta quantos clientes VIP foram listados

                        // Percorre todos os clientes para encontrar os que são VIPs
                        for (int i = 0; i < clientesCadastrados; i++) {
                            if (clientes[i] instanceof ClienteVIP) {
                                System.out.println(contadorAtualizar + ". " + clientes[i].nome); // Exibe a numeração corresponde ao cliente VIP e seu nome ao lado
                                indicesAtualizar[contadorAtualizar - 1] = i; // Salva o índice real no array
                                contadorAtualizar++; // Incrementa o número exibido
                                totalAtualizar++; // Conta esse clienteVIP
                                encontrou = true;

                            }
                        }

                        // Caso nenhum cliente VIP tenha sido encontrado
                        if (!encontrou) {
                            System.out.println("Nenhum Cliente VIP cadastrado");
                            break;
                        }

                        // Solicita ao usuário o número do cliente VIP que ele deseja atualizar o brinde
                        System.out.print("Digite o número do cliente VIP que você deseja atualizar o brinde: ");
                        int numeroAtualizar = scanner.nextInt();
                        scanner.nextLine();

                        // Verifica se o número escolhido é válido
                        if (numeroAtualizar >= 1 && numeroAtualizar <= totalAtualizar) {
                            // Recupera o índice real do cliente VIP
                            int indiceAtualizar = indicesAtualizar[numeroAtualizar - 1];

                            // Confirma novamente que o cliente selecionado é realmente VIP (verificação de segurança)
                            if (clientes[indiceAtualizar] instanceof ClienteVIP ) {
                                ClienteVIP clienteVIP = (ClienteVIP) clientes[indiceAtualizar];

                                // Solicita o novo brinde e atualiza o atributo
                                System.out.print("Digite o novo brinde do cliente VIP: ");
                                clienteVIP.brinde = scanner.nextLine();
                                System.out.println("Brinde atualizado com sucesso");

                            } else {
                                System.out.println("O cliente escolhido não é um cliente VIP");
                            }

                        } else {
                            System.out.println("Número inválido");
                        }

                    } else {
                        System.out.println("Nenhum cliente cadastrado");
                    }
                    break;

                case 4:

                    // Finaliza o programa
                    System.out.println("Programa finalizado");
                    break;

                default:

                    // Caso o usuário tenha selecionado uma opção inválida
                    System.out.println("Opção inválida");
                    break;

            }
        }
        scanner.close();

    }
}

