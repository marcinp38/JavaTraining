package Exercises.Level3;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class ZarzadzanieBiletami {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    SystemRezerwacji systemRezerwacji = new SystemRezerwacji();

    String nazwaPliku = "rezerwacje.txt";

    while (true) {
      System.out.println("\nWybierz opcję: ");
      System.out.println("1 - Dodaj rezerwację biletu");
      System.out.println("2 - Usuń rezerwację biletu");
      System.out.println("3 - Wyświetl wszystkie rezerwacje biletów");
      System.out.println("4 - Zapisz stan rezerwacji do pliku");
      System.out.println("5 - Wczytaj stan rezerwacji z pliku");
      System.out.println("6 - Zakończ program");

      String opcja = scanner.nextLine();

      switch (opcja) {
        case "1" -> dodajRezerwacjeBiletu(scanner, systemRezerwacji);
        case "2" -> usunRezerwacjeBiletu(scanner, systemRezerwacji);
        case "3" -> systemRezerwacji.wyswietlWszystkieRezerwacje();
        case "4" -> systemRezerwacji.zapiszStanRezerwacjiDoPliku(nazwaPliku);
        case "5" -> systemRezerwacji.wczytajStanRezerwacjiZPliku(nazwaPliku);
        case "6" -> {
          System.out.println("Do widzenia!");
          scanner.close();
          return;
        }
        default -> System.out.println("Niepoprawna opcja. Spróbuj ponownie.");
      }
    }
  }
      private static void dodajRezerwacjeBiletu(Scanner scanner, SystemRezerwacji systemRezerwacji) {
        try {
          System.out.println("Podaj typ biletu (dziecko, dorosły, senior):");
          String typBiletu = scanner.nextLine();

          System.out.println("Podaj cenę biletu:");
          double cena = Double.parseDouble(scanner.nextLine());

          System.out.println("Podaj datę wizyty (format YYYY-MM-DD):");
          String data = scanner.nextLine();
          LocalDate dataWizyty = LocalDate.parse(data, DateTimeFormatter.ISO_LOCAL_DATE);

          Bilet bilet = new Bilet(typBiletu, cena, dataWizyty);
          systemRezerwacji.dodajRezerwacjeBiletu(bilet);

          System.out.println("Rezerwacja została dodana.");
        } catch (NumberFormatException e) {
          System.err.println("Niepoprawny format liczby: " + e.getMessage());
        } catch (DateTimeParseException e) {
          System.err.println("Niepoprawny format daty. Użyj formatu YYYY-MM-DD");
        }
      }

  private static void usunRezerwacjeBiletu(Scanner scanner, SystemRezerwacji systemRezerwacji) {
    System.out.println("Podaj typ biletu do usunięcia:");
    String typBiletu = scanner.nextLine();

    System.out.println("Podaj datę wizyty do usunięcia (format YYYY-MM-DD):");
    String dataWizytyString = scanner.nextLine();
    LocalDate dataWizyty;

    try {
      dataWizyty = LocalDate.parse(dataWizytyString, DateTimeFormatter.ISO_LOCAL_DATE);
    } catch (DateTimeParseException e) {
      System.err.println("Niepoprawny format daty. Użyj formatu YYYY-MM-DD.");
      return;
    }
    systemRezerwacji.usunRezerwacjeBiletu((typBiletu), dataWizyty);
    System.out.println("Jeśli istniała, rezerwacja została usunięta.");

  }
}
