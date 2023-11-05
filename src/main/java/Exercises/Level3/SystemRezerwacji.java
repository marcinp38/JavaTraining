package Exercises.Level3;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class SystemRezerwacji {
  List<Bilet> listaBiletow = new ArrayList<>();

  public void dodajRezerwacjeBiletu(Bilet bilet){
    if (bilet != null) {
      listaBiletow.add(bilet);
    } else {
      System.out.println("Nie można dodać pustego biletu.");
    }
  }

  public void usunRezerwacjeBiletu(String typBiletu, LocalDate dataWizyty){
    boolean usunieta = false;
    listaBiletow.removeIf(bilet -> bilet.getTypBiletu().equals(typBiletu) && bilet.getDataWizyty().isEqual(dataWizyty));
      }

  public void wyswietlWszystkieRezerwacje(){
    if (listaBiletow.isEmpty()) {
      System.out.println("Brak rezerwacji na liscie");
    } else {
      for (Bilet bilet : listaBiletow
      ) {
        System.out.println(bilet);
      }
    }
  }

  public void zapiszStanRezerwacjiDoPliku(String nazwaPliku){
    Path sciezka = Path.of(nazwaPliku);

    List<String> linieDoZapisu = listaBiletow.stream()
        .map(bilet -> String.join(",",
            bilet.getTypBiletu(),
            String.valueOf(bilet.getCena()),
            bilet.getDataWizyty().toString()))
        .collect(Collectors.toList());

    try {
      Files.write(sciezka, linieDoZapisu, StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);
    } catch (IOException e) {
      System.err.println("Wystąpił błąd podczas zapisu do pliku: " + e.getMessage());
    }

  }

  public void wczytajStanRezerwacjiZPliku(String nazwaPliku) {
    Path sciezka = Path.of(nazwaPliku);
    try {
      List<String> linieZPliku = Files.readAllLines(sciezka);

      listaBiletow = linieZPliku.stream().map(linia -> {
        String[] elementy = linia.split(",");
        try {
          String typBiletu = elementy[0].trim();
          double cena = Double.parseDouble(elementy[1].trim());
          LocalDate dataWizyty = LocalDate.parse(elementy[2].trim());
          return new Bilet(typBiletu, cena, dataWizyty);
        } catch (NumberFormatException | DateTimeParseException e) {
          System.err.println("Błąd podczas przetwarzania linii: " + linia);
          return null;
        }
      }).filter(Objects::nonNull).collect(Collectors.toList());
    } catch (IOException e) {
      System.err.println("Wystąpił błąd podczas wczytywania pliku");

    }
  }


}
