import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wprowadź imię.");
        String first_name = scanner.nextLine();
        System.out.println("Wprowadź nazwisko.");
        String last_name = scanner.nextLine();
        System.out.println("Wprowadź miejsce zamieszkania.");
        String city = scanner.nextLine();
        System.out.println("Wprowadź swój wiek.");
        int age = scanner.nextInt();
        boolean JestemWZwiazku = true;
        String zwiazek = scanner.nextLine();
        if (zwiazek == "Tak") {
            JestemWZwiazku = true;
        } else {
            JestemWZwiazku = false;
        }
        System.out.println("Twój status związku: " + JestemWZwiazku);
    }
    public static int getInt() {
        return new Scanner(System.in).nextInt();
    }
}
