package IntermediateLevel.IntermediateChallenge1;

public class VIPClient extends Client {

    String gift;

    public void showGift() {
        System.out.println(gift);
    }

    @Override
    public void showInformation() {
        super.showInformation();
        System.out.println("The VIP gift: " + gift);
    }
}
