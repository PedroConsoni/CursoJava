package NivelBasico;

public class DesafioBasico1 {
    public static void main(String[] args) {

        // Informações do Naruto Uzumaki
        String ninja1 = "Naruto Uzumaki";
        int idade1 = 18;
        String missao1 = "Resgatar o Sasuke";
        char nivelDaMissao1 = 'S';
        String statusDaMissao1;

        if (idade1 < 15) {
            if (nivelDaMissao1 == 'D' || nivelDaMissao1 == 'C') {
                statusDaMissao1 = "Missão concluída";
            } else {
                statusDaMissao1 = "Missão não concluída";
            }
        } else {
            statusDaMissao1 = "Missão concluída";
        }


        System.out.println("Nome: " + ninja1);
        System.out.println("Idade: " + idade1);
        System.out.println("Missão: " + missao1);
        System.out.println("Nível da missão: " + nivelDaMissao1);
        System.out.println("Status da missão: " + statusDaMissao1);
        System.out.println("---------------------------------------------");


        // Informações do Sasuke Uchiha
        String ninja2 = "Sasuke Uchiha";
        int idade2 = 10;
        String missao2 = "Derrotar o Itachi";
        char nivelDaMissao2 = 'C';
        String statusDaMissao2;

        if (idade2 < 15) {
            if (nivelDaMissao2 == 'D' || nivelDaMissao2 == 'C') {
                statusDaMissao2 = "Missão concluída";
            } else {
                statusDaMissao2 = "Missão não concluída";
            }
        } else {
            statusDaMissao2 = "Missão concluída";
        }

        System.out.println("Nome: " + ninja2);
        System.out.println("Idade: " + idade2);
        System.out.println("Missão: " + missao2);
        System.out.println("Nível da missão: " + nivelDaMissao2);
        System.out.println("Status da missão: " + statusDaMissao2);
        System.out.println("---------------------------------------------");


        // Informações da Sakura Haruno
        String ninja3 = "Sakura Haruno";
        int idade3 = 16;
        String missao3 = "Salvar os feridos";
        char nivelDaMissao3 = 'D';
        String statusDaMissao3;

        if (idade3 < 15) {
            if (nivelDaMissao3 == 'D' || nivelDaMissao3 == 'C') {
                statusDaMissao3 = "Missão concluída";
            } else {
                statusDaMissao3 = "Missão não concluída";
            }
        } else {
            statusDaMissao3 = "Missão concluída";
        }

        System.out.println("Nome: " + ninja3);
        System.out.println("Idade: " + idade3);
        System.out.println("Missão: " + missao3);
        System.out.println("Nível da missão: " + nivelDaMissao3);
        System.out.println("Status da missão: " + statusDaMissao3);
        System.out.println("---------------------------------------------");
    }
}
