package Exercises.Level2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class SklepZoologiczny {
  private List<Zwierze> listaZwierzat = new ArrayList<>();

  public void dodajZwierze(Zwierze zwierze) {
    if (zwierze != null) {
      listaZwierzat.add(zwierze);
    } else {
      System.out.println("Nie można dodać pustego zwierzęcia!");
    }
  }

  public void usunZwierze(String nazwa) {
    boolean usuniety = false;

    for (int i = 0; i < listaZwierzat.size(); i++) {
      if (listaZwierzat.get(i).getNazwa().equalsIgnoreCase(nazwa)) {
        listaZwierzat.remove(i);
        usuniety = true;
        break;
      }
    }
    if (!usuniety) {
      System.out.println("Nie znaleziono zwierzęcia o podanej nazwie!");
    }
  }

  public void wyswietlDostepneZwierzeta() {
    if (listaZwierzat.isEmpty()) {
      System.out.println("Nie ma żadnych zwierząt w sklepie.");
    } else {
      for (Zwierze zwierze : listaZwierzat) {
        System.out.println(zwierze);
      }
    }
  }
  public void sortujWgCeny(){
    listaZwierzat.sort(Comparator.comparingDouble(Zwierze::getCena));
  }
  public void wyszukajWgGatunku() {
    Scanner scanner = new Scanner(System.in);
    boolean czyGatunekJestNaLiscie = false;
    System.out.println("Podaj gatunek zwierzęcia/zwierząt: ");
    String gatunek = scanner.nextLine();
      listaZwierzat.isEmpty();
      for (Zwierze zwierze : listaZwierzat) {
        if (gatunek.equals(zwierze.getGatunek())) {
          System.out.println(zwierze);
          czyGatunekJestNaLiscie = true;
        }
      }


  }
}

