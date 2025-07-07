package IntermediateLevel.IntermediateChallenge2;

public class JuniorEmployee implements Work {

    String name;
    int age;
    String graduation;

    private Sector sector;

    @Override
    public void showInformations() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Graduation: " + graduation);
    }

    @Override
    public void runTask() {
        System.out.println("Employee " + name + " is " + age + " years old and graduated in " + graduation);
    }

    public void showSector() {
        System.out.println("Sector: " + sector);
    }

    public JuniorEmployee(String name, int age, String graduation, Sector sector) {
        this.name = name;
        this.age = age;
        this.graduation = graduation;
        this.sector = sector;
    }

    public JuniorEmployee() {
    }
}
