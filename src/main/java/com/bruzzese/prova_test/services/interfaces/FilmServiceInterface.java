package com.bruzzese.prova_test.services.interfaces;

import java.util.List;

import com.bruzzese.prova_test.entities.Film;

public interface FilmServiceInterface {

  public List<Film> getFilms();
  public Film getFilmById(int id);
  public List<Film> getFilmsByNome(String nome);
  public List<Film> getFilmsByGenere(String genere);

  public Film createFilm(Film film);

  public Film updateFilm(Film film);

  public void deleteFilm(int id);

}
