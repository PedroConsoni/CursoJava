package IntermediateLevel.IntermediateChallenge2;

public class SeniorEmployee extends JuniorEmployee implements Work {

    String postgraduate;

    private Sector sector;

    @Override
    public void showInformations() {
        super.showInformations();
        System.out.println("Postgraduate: " + postgraduate);
    }

    @Override
    public void runTask() {
        System.out.println("Employee " + name + " is " + age + " years old, graduated in " + graduation + " and completed a postgraduate degree in " + postgraduate);
    }

    @Override
    public void showSector() {
        super.showSector();
    }

    public SeniorEmployee(String name, int age, String graduation, Sector sector, String postgraduate) {
        super(name, age, graduation, sector);
        this.postgraduate = postgraduate;
    }

    public SeniorEmployee() {
    }
}
