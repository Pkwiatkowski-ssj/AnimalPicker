import java.util.Scanner;
public class AnimalPicker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Would you like to see a Dog, or Cat?");
        String choice = scanner.nextLine();

        while (!choice.equalsIgnoreCase("Dog") && !choice.equalsIgnoreCase("Cat")) {
            System.out.println("Please insert valid option. The choices are 'Dog',or 'cat' ");
            choice = scanner.nextLine().trim();
        }
        if (choice.equals("Dog")){
            System.out.println("^..^      /\n/_/\\_____/\n   /\\   /\\\n  /  \\ /  \\\n ruff");
        } else if (choice.equals("Cat")) {
        System.out.println(" /\\_/\\\n( o.o )\n > ^ <\n meow");
}else {
    System.out.println("Invalid Choice, Please type Dog or Cat");
}

    }
}
