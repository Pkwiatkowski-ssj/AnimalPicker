import java.util.Scanner;

public class AnimalPicker{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Would you like to see a Dog, Cat, Fish or Computer?");
        String choice = scanner.nextLine();

        while (!choice.equalsIgnoreCase("Dog") && !choice.equalsIgnoreCase("Cat") && !choice.equalsIgnoreCase("Fish") && !choice.equalsIgnoreCase("Computer")) {
            System.out.println("Please insert valid option. The choices are 'Dog','Cat', 'Fish' or 'Computer'");
            choice = scanner.nextLine().trim();
        }
        if (choice.equals("Dog")){
            System.out.println("^..^      /\n/_/\\_____/\n   /\\   /\\\n  /  \\ /  \\\n ruff");
        } else if (choice.equals("Cat")) {
        System.out.println(" /\\_/\\\n( o.o )\n > ^ <\n meow");
        } else if  (choice.equals("Fish")){
            System.out.println("     .\n      \":\"\n    ___:____     |\"\\/\"|\n  ,\'        `.    \\  /\n  |  O        \\___/  |\n~^~^~^~^~^~^~^~^~^~^~^~^~\n WoooooOOOOooo");
        } else if  (choice.equals("Computer")){
            System.out.println("    +--------------+\r\n" + //
                                "   |.------------.|\r\n" + //
                                "   ||            ||\r\n" + //
                                "   ||            ||\r\n" + //
                                "   ||            ||\r\n" + //
                                "   ||            ||\r\n" + //
                                "   |+------------+|\r\n" + //
                                "   +-..--------..-+\r\n" + //
                                "   .--------------.\r\n" + //
                                "  / /============\\ \\\r\n" + //
                                " / /==============\\ \\\r\n" + //
                                "/____________________\\\r\n" + //
                                "\\____________________/");
        }else {
            System.out.println("Invalid Choice, Please type Dog or Cat");
        }
    
    }
}