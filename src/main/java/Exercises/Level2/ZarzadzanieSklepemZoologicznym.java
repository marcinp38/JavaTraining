package Exercises.Level2;

import java.util.Scanner;

public class ZarzadzanieSklepemZoologicznym {
  public static void main(String[] args) {
    SklepZoologiczny sklep = new SklepZoologiczny();
    Scanner scanner = new Scanner(System.in);

    while (true) {
      System.out.println("\nWybierz opcję:");
      System.out.println("1 - Dodaj zwierzę");
      System.out.println("2 - Usuń zwierzę");
      System.out.println("3 - Wyświetl dostępne zwierzęta");
      System.out.println("4 - Zakończ program");
      System.out.println("5 - Posortuj listę zwierząt wg ceny");
      System.out.println("6 - Wyszukaj zwierzeta wg gatunku");
      int wybor = scanner.nextInt();
      scanner.nextLine();

      switch (wybor) {
        case 1:
          System.out.print("Podaj nazwę zwierzęcia: ");
          String nazwa = scanner.nextLine();
          System.out.print("Podaj gatunek zwierzęcia: ");
          String gatunek = scanner.nextLine();
          System.out.print("Podaj cenę zwierzęcia: ");
          double cena = scanner.nextDouble();
          sklep.dodajZwierze(new Zwierze(nazwa, gatunek, cena));
          break;
        case 2:
          System.out.print("Podaj nazwę zwierzęcia do usunięcia: ");
          nazwa = scanner.nextLine();
          sklep.usunZwierze(nazwa);
          break;
        case 3:
          sklep.wyswietlDostepneZwierzeta();
          break;
        case 4:
          System.out.println("Do widzenia!");
          return;
        case 5:
          sklep.sortujWgCeny();
          System.out.println("Lista zwierząt została posortowana wg ceny");
          break;
        case 6:
          sklep.wyszukajWgGatunku();
          break;
        default:
          System.out.println("Niepoprawny wybór. Spróbuj ponownie.");
      }
    }
  }
}
