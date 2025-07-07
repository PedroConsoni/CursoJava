package IntermediateLevel.IntermediateChallenge1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Creating a fixed-size array of clients
        int maxNumber = 10;
        Client[] clients = new Client[maxNumber];

        // Initialize control variables
        int option = 0;
        int registeredClients = 0;

        // Main menu loop with all its options
        while (option != 4) {
            System.out.println("============================================================================= MENU =============================================================================");
            System.out.println("1. Register clients");
            System.out.println("2. Show client information");
            System.out.println("3. Update VIP client gift");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            // Read user's option
            option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {

                case 1:
                    System.out.print("Choose option A ( Client ) or option B ( VIP Client ): ");
                    String clientChoice = scanner.nextLine();

                    if (registeredClients < maxNumber && clientChoice.equalsIgnoreCase("A")) {

                        Client newClient = new Client();
                        System.out.print("Enter the client's name: ");
                        newClient.name = scanner.nextLine();
                        System.out.print("Enter the client's age: ");
                        newClient.age = scanner.nextInt();
                        scanner.nextLine();
                        System.out.print("Enter the client's email: ");
                        newClient.email = scanner.nextLine();
                        System.out.print("Enter the client's password: ");
                        newClient.password = scanner.nextLine();
                        System.out.print("Enter the client's CPF: ");
                        newClient.CPF = scanner.nextLine();

                        clients[registeredClients] = newClient;
                        registeredClients++;

                    } else if (registeredClients < maxNumber && clientChoice.equalsIgnoreCase("B")) {

                        VIPClient newVIPClient = new VIPClient();
                        System.out.print("Enter the VIP client's name: ");
                        newVIPClient.name = scanner.nextLine();
                        System.out.print("Enter the VIP client's age: ");
                        newVIPClient.age = scanner.nextInt();
                        scanner.nextLine();
                        System.out.print("Enter the VIP client's email: ");
                        newVIPClient.email = scanner.nextLine();
                        System.out.print("Enter the VIP client's password: ");
                        newVIPClient.password = scanner.nextLine();
                        System.out.print("Enter the VIP client's CPF: ");
                        newVIPClient.CPF = scanner.nextLine();
                        System.out.print("Enter the VIP client's gift: ");
                        newVIPClient.gift = scanner.nextLine();

                        clients[registeredClients] = newVIPClient;
                        registeredClients++;

                    } else {
                        System.out.println("Invalid option");
                    }
                    break;

                case 2:
                    if (registeredClients != 0) {
                        System.out.print("Do you want to view option A ( Client ) or option B ( VIP Client ): ");
                        String viewChoice = scanner.nextLine();

                        boolean found = false;
                        int displayCounter = 1;
                        int[] realIndexes = new int[registeredClients];
                        int totalFound = 0;

                        for (int i = 0; i < registeredClients; i++) {
                            if (viewChoice.equalsIgnoreCase("A") && !(clients[i] instanceof VIPClient)) {
                                System.out.println(displayCounter + ". " + clients[i].name);
                                realIndexes[displayCounter - 1] = i;
                                displayCounter++;
                                totalFound++;
                                found = true;

                            } else if (viewChoice.equalsIgnoreCase("B") && clients[i] instanceof VIPClient) {
                                System.out.println(displayCounter + ". " + clients[i].name);
                                realIndexes[displayCounter - 1] = i;
                                displayCounter++;
                                totalFound++;
                                found = true;
                            }
                        }

                        if (!found) {
                            System.out.println("There are no clients of the selected type.");
                            break;
                        }

                        System.out.print("Enter the number of the client whose information you want to view: ");
                        int selectedNumber = scanner.nextInt();
                        scanner.nextLine();

                        if (selectedNumber >= 1 && selectedNumber <= totalFound) {
                            int realIndex = realIndexes[selectedNumber - 1];
                            Client selectedClient = clients[realIndex];

                            if ((viewChoice.equalsIgnoreCase("A") && !(selectedClient instanceof VIPClient)) ||
                                    (viewChoice.equalsIgnoreCase("B") && selectedClient instanceof VIPClient)) {

                                System.out.println("================================================================================================================================================================");
                                selectedClient.showInformation();
                                System.out.println("================================================================================================================================================================");

                            } else {
                                System.out.println("The selected number does not match the chosen client type.");
                            }

                        } else {
                            System.out.println("Invalid number");
                        }

                    } else {
                        System.out.println("No clients registered");
                    }
                    break;

                case 3:
                    if (registeredClients != 0) {
                        boolean found = false;
                        int updateCounter = 1;
                        int[] updateIndexes = new int[registeredClients];
                        int totalToUpdate = 0;

                        for (int i = 0; i < registeredClients; i++) {
                            if (clients[i] instanceof VIPClient) {
                                System.out.println(updateCounter + ". " + clients[i].name);
                                updateIndexes[updateCounter - 1] = i;
                                updateCounter++;
                                totalToUpdate++;
                                found = true;
                            }
                        }

                        if (!found) {
                            System.out.println("No VIP Clients registered");
                            break;
                        }

                        System.out.print("Enter the number of the VIP client whose gift you want to update: ");
                        int updateNumber = scanner.nextInt();
                        scanner.nextLine();

                        if (updateNumber >= 1 && updateNumber <= totalToUpdate) {
                            int realIndex = updateIndexes[updateNumber - 1];

                            if (clients[realIndex] instanceof VIPClient) {
                                VIPClient vipClient = (VIPClient) clients[realIndex];

                                System.out.print("Enter the new gift for the VIP client: ");
                                vipClient.gift = scanner.nextLine();
                                System.out.println("Gift successfully updated");

                            } else {
                                System.out.println("The selected client is not a VIP Client");
                            }

                        } else {
                            System.out.println("Invalid number");
                        }

                    } else {
                        System.out.println("No clients registered");
                    }
                    break;

                case 4:
                    System.out.println("Program finished");
                    break;

                default:
                    System.out.println("Invalid option");
                    break;
            }
        }
        scanner.close();
    }
}