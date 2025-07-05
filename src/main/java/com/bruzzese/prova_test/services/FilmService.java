package com.bruzzese.prova_test.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bruzzese.prova_test.entities.Film;
import com.bruzzese.prova_test.repositories.FilmRepository;
import com.bruzzese.prova_test.services.interfaces.FilmServiceInterface;

@Service
public class FilmService implements FilmServiceInterface {

  @Autowired
  private FilmRepository filmRepository;

  @Override
  public List<Film> getFilms() {
    return filmRepository.findAll();
  }

  @Override
  public Film getFilmById(int id) {
    return filmRepository.findById(id).get();
  }

  @Override
  public List<Film> getFilmsByNome(String nome) {
    return filmRepository.findByNomeContaining(nome);
  }

  @Override
  public List<Film> getFilmsByGenere(String genere) {
    return filmRepository.findByGenere(genere);
  }

  @Override
  public Film createFilm(Film film) {
    return filmRepository.save(film);
  }

  @Override
  public Film updateFilm(Film film) {
    return filmRepository.save(film);
  }

  @Override
  public void deleteFilm(int id) {
    filmRepository.deleteById(id);
  }

}
