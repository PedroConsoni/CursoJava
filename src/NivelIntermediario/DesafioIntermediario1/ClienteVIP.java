package NivelIntermediario.DesafioIntermediario1;

public class ClienteVIP extends Cliente {

    String brinde;

    public void mostrarBrinde() {
        System.out.println(brinde);
    }

    @Override
    public void mostrarInformacoes() {
        super.mostrarInformacoes();
        System.out.println("O brinde do VIP: " + brinde);
    }
}
