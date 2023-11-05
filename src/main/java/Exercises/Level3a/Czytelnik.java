package Exercises.Level3a;

import java.util.ArrayList;
import java.util.List;

public class Czytelnik {
  private String imieCzytelnika;
  private String nazwiskoCzytelnika;
  private final int idCzytelnika;
  private List<Ksiazka> wypozyczoneKsiazki;

  public String getImieCzytelnika() {
    return imieCzytelnika;
  }

  public void setImieCzytelnika(String imieCzytelnika) {
    this.imieCzytelnika = imieCzytelnika;
  }

  public String getNazwiskoCzytelnika() {
    return nazwiskoCzytelnika;
  }

  public void setNazwiskoCzytelnika(String nazwiskoCzytelnika) {
    this.nazwiskoCzytelnika = nazwiskoCzytelnika;
  }

  public int getIdCzytelnika() {
    return idCzytelnika;
  }

  public List<Ksiazka> getWypozyczoneKsiazki() {
    return wypozyczoneKsiazki;
  }

  public Czytelnik(String imieCzytelnika, String nazwiskoCzytelnika, int idCzytelnika) {
    this.imieCzytelnika = imieCzytelnika;
    this.nazwiskoCzytelnika = nazwiskoCzytelnika;
    this.idCzytelnika = idCzytelnika;
    this.wypozyczoneKsiazki = new ArrayList<>();
  }

  @Override
  public String toString() {
    return "Czytelnik{" +
        "imieCzytelnika='" + imieCzytelnika + '\'' +
        ", nazwiskoCzytelnika='" + nazwiskoCzytelnika + '\'' +
        ", idCzytelnika='" + idCzytelnika + '\'' +
        ", wypozyczoneKsiazki=" + wypozyczoneKsiazki +
        '}';
  }

  public void wypozyczKsiazke(Ksiazka ksiazka){
    if (ksiazka != null && !ksiazka.isCzyWypozyczona()) {
      wypozyczoneKsiazki.add(ksiazka);
      ksiazka.setCzyWypozyczona(true);
    }
  }

  public void zwrocKsiazke(Ksiazka ksiazka){
    if (ksiazka != null && ksiazka.isCzyWypozyczona()) {
      wypozyczoneKsiazki.remove(ksiazka);
      ksiazka.setCzyWypozyczona(false);
    }
  }

}
