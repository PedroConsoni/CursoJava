package BasicLevel.BasicChallenge2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int maxNumber = 10;
        String[] people = new String[maxNumber];

        int registeredPeople = 0;
        int option = 0;

        // Loop structure that continues until the user chooses option '3' (exit)
        while (option != 3) {
            // Displays the menu options to the user
            System.out.println("\n========================= Menu =========================");
            System.out.println("1. Register people");
            System.out.println("2. List registered people");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            // Reads the option chosen by the user
            option = scanner.nextInt();
            scanner.nextLine();

            // Control structure that performs actions based on the option chosen by the user
            switch (option) {
                case 1:
                    // Checks if there is space left in the array to register more people
                    if (registeredPeople < maxNumber) {
                        System.out.print("Enter the name of the person to register: ");
                        String personName = scanner.nextLine();
                        people[registeredPeople] = personName;
                        registeredPeople++;
                        System.out.println("Person successfully registered");
                    } else {
                        // If the array is already full
                        System.out.println("The list is full");
                    }
                    break;

                // If the user chooses option '2', the list of registered people will be displayed
                case 2:
                    // Checks if there is anyone registered
                    if (registeredPeople != 0) {
                        System.out.println("============= List of registered people =============");
                        for (int i = 0; i < registeredPeople; i++) {
                            System.out.println(people[i]);
                        }
                    } else {
                        // If no one has been registered yet
                        System.out.println("The list is empty.");
                    }
                    break;

                // If the user chooses option '3', the program will end
                case 3:
                    System.out.println("Program finished");
                    break;

                // If the user enters an invalid option
                default:
                    System.out.println("This option is invalid.");
                    break;
            }
        }
        scanner.close();
    }
}