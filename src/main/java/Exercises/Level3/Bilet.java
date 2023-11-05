package Exercises.Level3;

import java.time.LocalDate;

public class Bilet {
  private String typBiletu;
  private double cena;
  private LocalDate dataWizyty;

  public Bilet(String typBiletu, double cena, LocalDate dataWizyty) {
    this.typBiletu = typBiletu;
    this.cena = cena;
    this.dataWizyty = dataWizyty;
  }

  public String getTypBiletu() {
    return typBiletu;
  }

  public double getCena() {
    return cena;
  }

  public LocalDate getDataWizyty() {
    return dataWizyty;
  }

  public void setTypBiletu(String typBiletu) {
    this.typBiletu = typBiletu;
  }

  public void setCena(double cena) {
    this.cena = cena;
  }

  public void setDataWizyty(LocalDate dataWizyty) {
    this.dataWizyty = dataWizyty;
  }

  @Override
  public String toString() {
    return "Bilet{" +
        "typBiletu='" + typBiletu + '\'' +
        ", cena=" + cena +
        ", dataWizyty=" + dataWizyty +
        '}';
  }
}
