package Exercises.Level3a;

public class Ksiazka {
  private String tytulKsiazki;
  private String autorKsiazki;
  private int rokWydania;
  private boolean czyWypozyczona;

  public Ksiazka(String tytulKsiazki, String autorKsiazki, int rokWydania, boolean czyWypozyczona) {
    this.tytulKsiazki = tytulKsiazki;
    this.autorKsiazki = autorKsiazki;
    this.rokWydania = rokWydania;
    this.czyWypozyczona = czyWypozyczona;
  }

  public String getTytulKsiazki() {
    return tytulKsiazki;
  }

  public void setTytulKsiazki(String tytulKsiazki) {
    this.tytulKsiazki = tytulKsiazki;
  }

  public String getAutorKsiazki() {
    return autorKsiazki;
  }

  public void setAutorKsiazki(String autorKsiazki) {
    this.autorKsiazki = autorKsiazki;
  }

  public int getRokWydania() {
    return rokWydania;
  }

  public void setRokWydania(int rokWydania) {
    this.rokWydania = rokWydania;
  }

  public boolean isCzyWypozyczona() {
    return czyWypozyczona;
  }

  public void setCzyWypozyczona(boolean czyWypozyczona) {
    this.czyWypozyczona = czyWypozyczona;
  }

  @Override
  public String toString() {
    return "Ksiazka{" +
        "tytulKsiazki='" + tytulKsiazki + '\'' +
        ", autorKsiazki='" + autorKsiazki + '\'' +
        ", rokWydania=" + rokWydania +
        ", czyWypozyczona=" + czyWypozyczona +
        '}';
  }
}
