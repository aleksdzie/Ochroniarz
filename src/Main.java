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
        String zwiazek = scanner.nextLine();
        boolean JestemWZwiazku;
        System.out.println("Czy jesteś w związku?");
        if (zwiazek == "Tak") {
            JestemWZwiazku = true;
        } else {
            JestemWZwiazku = false;
        }
        System.out.println("Twój status związku: " + JestemWZwiazku);

        System.out.println("Cześć, " +first_name);
        System.out.println("Nazwisko: " +last_name);
        System.out.println("Jesteś z " +city);
        System.out.println("Masz "+age+" lat(a).");
        System.out.println("Jesteś w związku: " +zwiazek);
        System.out.println("Witaj na pokładzie klubu Testersi!");


    }
}
