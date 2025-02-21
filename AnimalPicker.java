import java.util.Scanner;

public class AnimalPicker{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Would you like to see a Dog, Cat or Fish?");
        String choice = scanner.nextLine();

        while (!choice.equalsIgnoreCase("Dog") && !choice.equalsIgnoreCase("Cat") && !choice.equalsIgnoreCase("Fish")) {
            System.out.println("Please insert valid option. The choices are 'Dog','Cat' or 'Fish' ");
            choice = scanner.nextLine().trim();
        }
        if (choice.equals("Dog")){
            System.out.println("^..^      /\n/_/\\_____/\n   /\\   /\\\n  /  \\ /  \\\n ruff");
        } else if (choice.equals("Cat")) {
        System.out.println(" /\\_/\\\n( o.o )\n > ^ <\n meow");
        } else if  (choice.equals("Fish")){
            System.out.println("     .\n      \":\"\n    ___:____     |\"\\/\"|\n  ,\'        `.    \\  /\n  |  O        \\___/  |\n~^~^~^~^~^~^~^~^~^~^~^~^~\n WoooooOOOOooo");
        }else {
            System.out.println("Invalid Choice, Please type Dog or Cat");
        }
    
        }
}