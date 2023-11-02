package Exercises.Level2;

public class Zwierze {
  private String nazwa;
  private String gatunek;
  private double cena;

  public Zwierze(String nazwa, String gatunek, double cena) {
    this.nazwa = nazwa;
    this.gatunek = gatunek;
    this.cena = cena;
  }

  public String getNazwa() {
    return nazwa;
  }

  public void setNazwa(String nazwa) {
    this.nazwa = nazwa;
  }

  public String getGatunek() {
    return gatunek;
  }

  public void setGatunek(String gatunek) {
    this.gatunek = gatunek;
  }

  public double getCena() {
    return cena;
  }

  public void setCena(int cena) {
    this.cena = cena;
  }

  @Override
  public String toString() {
    return "Zwierze:\n" +
        "nazwa:" + nazwa +
        ", gatunek:" + gatunek +
        ", cena=" + cena +
        "zl";
  }
}
