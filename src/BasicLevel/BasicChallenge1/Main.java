package BasicLevel.BasicChallenge1;

public class Main {
    public static void main(String[] args) {

        // Employee 1 Information
        String employee1 = "Pedro";
        int age1 = 18;
        String project1 = "Software development";
        char projectLevel1 = 'S';
        String projectStatus1;

        if (age1 < 15) {
            if (projectLevel1 == 'D' || projectLevel1 == 'C') {
                projectStatus1 = "Project completed";
            } else {
                projectStatus1 = "Project not completed";
            }
        } else {
            projectStatus1 = "Project completed";
        }

        System.out.println("Name: " + employee1);
        System.out.println("Age: " + age1);
        System.out.println("Project: " + project1);
        System.out.println("Project level: " + projectLevel1);
        System.out.println("Project status: " + projectStatus1);
        System.out.println("---------------------------------------------");

        // Employee 2 Information
        String employee2 = "Victor";
        int age2 = 10;
        String project2 = "Data analysis";
        char projectLevel2 = 'A';
        String projectStatus2;

        if (age2 < 15) {
            if (projectLevel2 == 'D' || projectLevel2 == 'C') {
                projectStatus2 = "Project completed";
            } else {
                projectStatus2 = "Project not completed";
            }
        } else {
            projectStatus2 = "Project completed";
        }

        System.out.println("Name: " + employee2);
        System.out.println("Age: " + age2);
        System.out.println("Project: " + project2);
        System.out.println("Project level: " + projectLevel2);
        System.out.println("Project status: " + projectStatus2);
        System.out.println("---------------------------------------------");

// Employee 3 Information
        String employee3 = "Matheus";
        int age3 = 16;
        String project3 = "Technical support";
        char projectLevel3 = 'C';
        String projectStatus3;

        if (age3 < 15) {
            if (projectLevel3 == 'D' || projectLevel3 == 'C') {
                projectStatus3 = "Project completed";
            } else {
                projectStatus3 = "Project not completed";
            }
        } else {
            projectStatus3 = "Project completed";
        }

        System.out.println("Name: " + employee3);
        System.out.println("Age: " + age3);
        System.out.println("Project: " + project3);
        System.out.println("Project level: " + projectLevel3);
        System.out.println("Project status: " + projectStatus3);
        System.out.println("---------------------------------------------");
    }
}
