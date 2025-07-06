package NivelBasico;

public class DesafioBasico1 {
    public static void main(String[] args) {

        // Informações do Fúncionario 1
        String funcionario1 = "Pedro";
        int idade1 = 18;
        String projeto1 = "Desenvolvimento do software";
        char nivelDoProjeto1 = 'S';
        String statusDoProjeto1;

        if (idade1 < 15) {
            if (nivelDoProjeto1 == 'D' || nivelDoProjeto1 == 'C') {
                statusDoProjeto1 = "Projeto concluído";
            } else {
                statusDoProjeto1 = "Projeto não concluído";
            }
        } else {
            statusDoProjeto1 = "Projeto concluído";
        }


        System.out.println("Nome: " + funcionario1);
        System.out.println("Idade: " + idade1);
        System.out.println("Projeto: " + projeto1);
        System.out.println("Nível do projeto: " + nivelDoProjeto1);
        System.out.println("Status do projeto: " + statusDoProjeto1);
        System.out.println("---------------------------------------------");


        // Informações do Fúncionario 2
        String funcionario2 = "Victor";
        int idade2 = 10;
        String projeto2 = "Análise de dados";
        char nivelDaProjeto2 = 'A';
        String statusDoProjeto2;

        if (idade2 < 15) {
            if (nivelDaProjeto2 == 'D' || nivelDaProjeto2 == 'C') {
                statusDoProjeto2 = "Projeto concluído";
            } else {
                statusDoProjeto2 = "Projeto não concluído";
            }
        } else {
            statusDoProjeto2 = "Projeto concluído";
        }

        System.out.println("Nome: " + funcionario2);
        System.out.println("Idade: " + idade2);
        System.out.println("Projeto: " + projeto2);
        System.out.println("Nível do projeto: " + nivelDaProjeto2);
        System.out.println("Status do projeto: " + statusDoProjeto2);
        System.out.println("---------------------------------------------");


        // Informações do Fúncionario 3
        String funcionario3 = "Matheus";
        int idade3 = 16;
        String projeto3 = "Suporte técnico";
        char nivelDoProjeto3 = 'C';
        String statusDoProjeto3;

        if (idade3 < 15) {
            if (nivelDoProjeto3 == 'D' || nivelDoProjeto3 == 'C') {
                statusDoProjeto3 = "Projeto concluído";
            } else {
                statusDoProjeto3 = "Projeto não concluído";
            }
        } else {
            statusDoProjeto3 = "Projeto concluído";
        }

        System.out.println("Nome: " + funcionario3);
        System.out.println("Idade: " + idade3);
        System.out.println("Projeto: " + projeto3);
        System.out.println("Nível do projeto: " + nivelDoProjeto3);
        System.out.println("Status do projeto: " + statusDoProjeto3);
        System.out.println("---------------------------------------------");
    }
}
