import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Driver {
	// array list for dog that was already provided
    private static ArrayList<Dog> dogList = new ArrayList<Dog>();
    
    //array list for monkey(same as dog but make changes for monkey
    private static ArrayList<Monkey> monkeyList = new ArrayList<Monkey>();
    
    public static void main(String[] args) {

        initializeDogList();
        initializeMonkeyList();
        
        // scanner for reading user input
        Scanner scanner = new Scanner(System.in);
        
        // Menu loop
        boolean exit = false;
        while (!exit) {
            displayMenu(); // Displays menu

            // Prompts and reads the user input
            String userInput = scanner.nextLine();

            // User's inputs
            switch (userInput) {
            // Call method to intake a new dog
            case "1":
                intakeNewDog(scanner);
                break;
                
             // Call method to intake a new monkey
            case "2":
                intakeNewMonkey(scanner);
                break;
                
             // Call method to reserve an animal
            case "3":
                reserveAnimal(scanner);
                break;
                
             // Call method to print a list of all dogs
            case "4":
            	printAnimals("dog");
                break;
                
             // Call method to print a list of all monkeys
            case "5":
            	printAnimals("monkey");
                break;
                
             // Call method to print a list of all animals that are not reserved
            case "6":
                printAnimals("available");
                break;
                
             // Quit the application if the user enters "q"
            case "q":
                exit = true;
                System.out.println("Exiting the program. Goodbye!");
                break;
                
             // Inform the user of an invalid input
            default:
                System.out.println("Invalid input. Please try again.");
                break;
        }
    }

    scanner.close(); // Closes the scanner
}

	// This method prints the menu options
    public static void displayMenu() {
        System.out.println("\n\n");
        System.out.println("\t\t\t\tRescue Animal System Menu");
        System.out.println("[1] Intake a new dog");
        System.out.println("[2] Intake a new monkey");
        System.out.println("[3] Reserve an animal");
        System.out.println("[4] Print a list of all dogs");
        System.out.println("[5] Print a list of all monkeys");
        System.out.println("[6] Print a list of all animals that are not reserved");
        System.out.println("[q] Quit application");
        System.out.println();
        System.out.println("Enter a menu selection");
    }

    // Adds dogs to a list for testing
    public static void initializeDogList() {
        Dog dog1 = new Dog("Spot", "German Shepherd", "male", "1", "25.6", "05-12-2019", "United States", "intake", false, "United States");
        Dog dog2 = new Dog("Rex", "Great Dane", "male", "3", "35.2", "02-03-2020", "United States", "Phase I", false, "United States");
        Dog dog3 = new Dog("Bella", "Chihuahua", "female", "4", "25.6", "12-12-2019", "Canada", "in service", true, "Canada");

        dogList.add(dog1);
        dogList.add(dog2);
        dogList.add(dog3);
    }

    // Adds monkeys to a list for testing
    //Optional for testing
    public static void initializeMonkeyList() {

    }

    // intakeNewDog method
    public static void intakeNewDog(Scanner scanner) {
        System.out.println("What is the dog's name?");
        String name = scanner.nextLine();
        for(Dog dog: dogList) {
            if(dog.getName().equalsIgnoreCase(name)) {
                System.out.println("\n\nThis dog is already in our system\n\n");
                return; //returns to menu
            }
        }

       // Code to instantiate a new dog and add it to the appropriate list
            System.out.println("Enter the dog's breed:");
            String breed = scanner.nextLine();
            
            System.out.println("Enter the dog's gender:");
            String gender = scanner.nextLine();
            
            System.out.println("Enter the dog's age:");
            String age = scanner.nextLine();
            
            System.out.println("Enter the dog's weight:");
            String weight = scanner.nextLine();
            
            System.out.println("Enter the acquisition date (MM-DD-YYYY):");
            String acquisitionDate = scanner.nextLine();
            
            System.out.println("Enter the acquisition country:");
            String acquisitionCountry = scanner.nextLine();
            
            System.out.println("Enter the training status (example: intake, Phase I, in service):");
            String trainingStatus = scanner.nextLine();
            
            boolean reserved = false; // New intakes are not reserved yet.
            
            System.out.println("Enter the in-service country:");
            String inServiceCountry = scanner.nextLine();
            
            // Dog constructor
            Dog newDog = new Dog(name, breed, gender, age, weight, acquisitionDate, acquisitionCountry, trainingStatus, reserved, inServiceCountry);
            
            // Add the new Dog to the dogList
            dogList.add(newDog);
            
            System.out.println("New dog added successfully!");

    }

        // Completed intakeNewMonkey
        public static void intakeNewMonkey(Scanner scanner) {
        	System.out.println("What is the monkey's name?");
            String name = scanner.nextLine();
            for (Monkey monkey : monkeyList) {
                if (monkey.getName().equalsIgnoreCase(name)) {
                    System.out.println("\n\nThis monkey is already in our system\n\n");
                    return; // Return to menu
                }
            }
            
            // Allowed monkey list
            String[] allowedSpecies = {"Capuchin", "Guenon", "Macaque", "Marmoset", "Squirrel monkey", "Tamarin"};
            boolean validSpecies = false;
            String species = "";
            
            //validates monkey species input
            while (!validSpecies) {
                System.out.println("Enter the monkey's species:");
                species = scanner.nextLine();
                for (String s : allowedSpecies) {
                    if (species.equalsIgnoreCase(s)) {
                        validSpecies = true;
                        break;
                    }
                }
                if (!validSpecies) {
                    System.out.println("Invalid species. Please enter a valid species from the list.");
                }
            }
            
         // Code to instantiate a new monkey
            System.out.println("Enter the monkey's gender:");
            String gender = scanner.nextLine();

            System.out.println("Enter the monkey's age:");
            String age = scanner.nextLine();

            System.out.println("Enter the monkey's weight:");
            String weight = scanner.nextLine();
            
            // Monkey specific inputs
            System.out.println("Enter the monkey's tail length:");
            double tailLength = scanner.nextDouble();

            System.out.println("Enter the monkey's height:");
            double height = scanner.nextDouble();

            System.out.println("Enter the monkey's body length:");
            double bodyLength = scanner.nextDouble();
            // end of monkey specific inputs

            System.out.println("Enter the acquisition date (MM-DD-YYYY):");
            String acquisitionDate = scanner.nextLine();

            System.out.println("Enter the acquisition country:");
            String acquisitionCountry = scanner.nextLine();

            System.out.println("Enter the training status (example: intake, Phase I, in service):");
            String trainingStatus = scanner.nextLine();

            boolean reserved = false; // New intakes are typically not reserved yet

            System.out.println("Enter the in-service country:");
            String inServiceCountry = scanner.nextLine();

            // Monkey constructor
            Monkey newMonkey = new Monkey(name, gender, age, weight, 
                                          acquisitionDate, acquisitionCountry, 
                                          trainingStatus, reserved, inServiceCountry, 
                                          species, tailLength, height, bodyLength);

            // Adds new Monkey to the monkeyList
            monkeyList.add(newMonkey);

            System.out.println("New monkey added successfully!");
        }

        // Completed reserveAnimal
        // Finding the animal by animal type and in service country
        public static void reserveAnimal(Scanner scanner) {
        	System.out.println("Would you like to reserve a dog or a monkey?");
        	String animalType = scanner.nextLine();

            // Validate animal type input
            if (!animalType.equals("dog") && !animalType.equals("monkey")) {
                System.out.println("Invalid choice. Please enter 'dog' or 'monkey'.");
                return; // Exit method if input is invalid
            }
            
            // Input for service country
            System.out.println("Enter the in-service country:");
            String serviceCountry = scanner.nextLine();

            boolean found = false;
            
         // Checks if the user wants to reserve a dog
            if (animalType.equals("dog")) {
                for (Dog dog : dogList) {
                    if (dog.getAcquisitionLocation().equalsIgnoreCase(serviceCountry) && !dog.getReserved()) {
                        dog.setReserved(true);
                        System.out.println("A dog from " + serviceCountry + " has been reserved.");
                        found = true;
                        break; // Exit loop after reserving a dog
                    }
                }
            } 
            // Checks if the user wants to reserve a monkey
            else if (animalType.equals("monkey")) {
                for (Monkey monkey : monkeyList) {
                    if (monkey.getInServiceLocation().equalsIgnoreCase(serviceCountry) && !monkey.getReserved()) {
                        monkey.setReserved(true);
                        System.out.println("A monkey from " + serviceCountry + " has been reserved.");
                        found = true;
                        break; // Exit loop after reserving a monkey
                    }
                }
            } 

            // If no available animal was found
            if (!found) {
                System.out.println("No available " + animalType + " found in " + serviceCountry + " or they are already reserved.");
            }
        }
            
        // Completed printAnimals 
	// Remember that you only have to fully implement ONE of these lists. 
	// The other lists can have a print statement saying "This option needs to be implemented".
	// To score "exemplary" you must correctly implement the "available" list.
        public static void printAnimals(String listType) {
            boolean found = false; //to keep track of whether any animals that meet the criteria

            // dog list print placeholder
            if (listType.equals("dog")) {
                System.out.println("This option needs to be implemented.");
            }
            // monkey list print placeholder
            else if (listType.equals("monkey")) {
                System.out.println("This option needs to be implemented.");
            }
            // available - print all animals that are in service and not reserved(only one that needed to be implemented this time)
            else if (listType.equals("available")) {
                // Prints available dogs
                for (Dog dog : dogList) {
                    if (dog.getTrainingStatus().equals("in service") && !dog.getReserved()) {
                        System.out.println("Dog - Name: " + dog.getName() +
                                           ", Status: " + dog.getTrainingStatus() +
                                           ", Acquisition Country: " + dog.getAcquisitionLocation() +
                                           ", Reserved: " + dog.getReserved());
                        found = true;
                    }
                }

                // Prints available monkeys
                for (Monkey monkey : monkeyList) {
                    if (monkey.getTrainingStatus().equals("in service") && !monkey.getReserved()) {
                        System.out.println("Monkey - Name: " + monkey.getName() +
                                           ", Status: " + monkey.getTrainingStatus() +
                                           ", Acquisition Country: " + monkey.getInServiceLocation() +
                                           ", Reserved: " + monkey.getReserved());
                        found = true;
                    }
                }

                // If no available animals found
                if (!found) {
                    System.out.println("No available animals found.");
                }
            }
            // For invalid listType print placeholder
            else {
                System.out.println("This option needs to be implemented.");
            }
        }

}

