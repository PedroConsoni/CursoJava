package IntermediateLevel.IntermediateChallenge2;

public class Main {
    public static void main(String[] args) {

        JuniorEmployee Carlos = new JuniorEmployee("Peter", 22, "Business Administration", Sector.Administration);
        Carlos.showInformations();
        Carlos.runTask();
        Carlos.showSector();

        System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------");

        JuniorEmployee Felipe = new JuniorEmployee("John", 25, "Science in Accounting", Sector.Accounting);
        Felipe.showInformations();
        Felipe.runTask();
        Felipe.showSector();

        System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------");

        SeniorEmployee Gabriel = new SeniorEmployee("Gabriel", 35, "Computer science", Sector.Technology, "artificial intelligence");
        Gabriel.showInformations();
        Gabriel.runTask();
        Gabriel.showSector();
    }
}
