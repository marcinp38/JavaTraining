package Exercises.Level3a;

import java.util.ArrayList;
import java.util.List;

public class Biblioteka {

  List<Ksiazka> katalogKsiazek = new ArrayList<>();
  List<Czytelnik> zarejestrowaniCzytelnicy = new ArrayList<>();

  public void dodajKsiazke(Ksiazka ksiazka){
    if (ksiazka != null) {
      katalogKsiazek.add(ksiazka);
    } else {
      System.out.println("Brak informacji. Nie da sie dodac ksiazki");
    }
  }

  public void zarejestrujczytelnika(Czytelnik czytelnik){

  }

  public void wypozyczKsiazke(String tytulKsiazki, int idCzytelnika) {

  }

  public void zwrocKsiazke(String tytulKsiazki, int idCzytelnika) {

  }

  public void wyszukajKsiazke(String tytulKsiazki) {

  }
}
