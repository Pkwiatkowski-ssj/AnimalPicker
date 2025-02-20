import java.util.Scanner;
public class AnimalPicker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Would you like to see a Dog, or Cat?");
        String choice = scanner.nextLine();
        if (choice.equals("Dog")){
            System.out.println("Dog");
        } else if (choice.equals("Cat")) {
        System.out.println("Cat");
}
    }
}