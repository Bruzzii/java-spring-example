package com.bruzzese.prova_test.services.interfaces;

import com.bruzzese.prova_test.entities.Recensione;

public interface RecensioneServiceInterface {

  public Recensione createRecensione(Recensione recensione);
  public void deleteRecensione(int id);
  public Recensione getRecensione(int id);

}
