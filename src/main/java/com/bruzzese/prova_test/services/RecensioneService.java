package com.bruzzese.prova_test.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bruzzese.prova_test.entities.Recensione;
import com.bruzzese.prova_test.repositories.RecensioneRepository;
import com.bruzzese.prova_test.services.interfaces.RecensioneServiceInterface;

@Service
public class RecensioneService implements RecensioneServiceInterface {

  @Autowired
  private RecensioneRepository recensioneRepository;

  @Override
  public Recensione createRecensione(Recensione recensione) {
    return recensioneRepository.save(recensione);
  }

  @Override
  public void deleteRecensione(int id) {
    recensioneRepository.deleteById(id);
  }

  @Override
  public Recensione getRecensione(int id) {
    return recensioneRepository.findById(id).get();
  }



}
