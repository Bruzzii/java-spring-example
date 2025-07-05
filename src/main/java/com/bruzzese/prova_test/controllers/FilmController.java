package com.bruzzese.prova_test.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bruzzese.prova_test.entities.Film;
import com.bruzzese.prova_test.services.FilmService;

@Controller
@RequestMapping("/api")
public class FilmController {

  @Autowired
  private FilmService filmService;

  @GetMapping("/film")
  public List<Film> getFilms(){
    return filmService.getFilms();
  }

  @GetMapping("/film/{id}")
  public Film getFilmById(@PathVariable int id){
    return filmService.getFilmById(id);
  }

  @GetMapping("/film/name/{nome}")
  public List<Film> getFilmsByNome(@PathVariable String nome){
    return filmService.getFilmsByNome(nome);
  }

  @GetMapping("/film/genere/{genere}")
  public List<Film> getFilmsByGenere(@PathVariable String genere){
    return filmService.getFilmsByGenere(genere);
  }

  @PostMapping("/film/create")
  public String createFilm(@ModelAttribute Film film){
    film = filmService.createFilm(film);
    return "redirect:/";
  }

  @PutMapping("/film/update")
  public Film updateFilm(@RequestBody Film film){
    return filmService.createFilm(film);
  }

  @GetMapping("/film/delete/{id}")
  public String deleteFilm(@PathVariable int id){
    filmService.deleteFilm(id);
    return "redirect:/";
  }

}
