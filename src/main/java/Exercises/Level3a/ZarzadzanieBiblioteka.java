package Exercises.Level3a;

import java.util.Scanner;

public class ZarzadzanieBiblioteka {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    while (true) {
      System.out.println("\nWybierz opcje:");
      System.out.println("""
          1 - Dodaj książkę do katalogu.
          2 - Zarejestruj czytelnika.
          3 - Wypożycz książkę.
          4 - Zwróć książkę.
          5 - Wyszukaj książkę w katalogu.
          6 - Wyświetl dostępne książki.
          7 - Zakończ program.""");
      String opcja = scanner.nextLine();

      switch (opcja) {
        case "1" -> System.out.println("Dodaje ksiazke");
        case "2" -> System.out.println("Rejestruje uzytkownika");
        case "3" -> System.out.println("Wypozyczam ksiazke");
        case "4" -> System.out.println("Zwracam ksiazke");
        case "5" -> System.out.println("Wyszukaj ksiazke w katalogu");
        case "6" -> System.out.println("Wyswietl dostepne ksiazki");
        case "7" -> {
          System.out.println("Do widzenia!");
          scanner.close();
          return;
        }
        default -> System.out.println("Wybrales nieprawidlowy numer. Sprobuj ponownie");
      }
    }



  }
}
