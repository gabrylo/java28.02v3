import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj imię osoby:");
        String name = scanner.nextLine();

        System.out.println("Podaj miasto:");
        String city = scanner.nextLine();

        System.out.println("Podaj numer telefonu:");
        int phoneNumber = Integer.parseInt(scanner.nextLine());

        Person person = new Person(name, city, phoneNumber);


        System.out.println("Utworzono osobę o danych:");
        System.out.println("Imię: " + person.getName());
        System.out.println("Miasto: " + person.getCity());
        System.out.println("Numer telefonu: " + person.getPhoneNumber());
        System.out.print("Czy usunąć osobę? (t/n): ");
        String answer = scanner.nextLine();
        if (answer.equalsIgnoreCase("t")) {
            person = null;
            System.out.println("Osoba usunięta.");
        } else {
            System.out.println("Nie usunięto osoby.");
        }
    }
}