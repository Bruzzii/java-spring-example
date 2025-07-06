package com.bruzzese.prova_test.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.bruzzese.prova_test.entities.Film;
import com.bruzzese.prova_test.services.FilmService;

@Controller
@RequestMapping("/api/film")
public class FilmController {

  @Autowired
  private FilmService filmService;

  @GetMapping("/")
  public List<Film> getFilms(){
    return filmService.getFilms();
  }

  @GetMapping("/{id}")
  public Film getFilmById(@PathVariable int id){
    return filmService.getFilmById(id);
  }

  @GetMapping("/name/{nome}")
  public List<Film> getFilmsByNome(@PathVariable String nome){
    return filmService.getFilmsByNome(nome);
  }

  @GetMapping("/genere/{genere}")
  public List<Film> getFilmsByGenere(@PathVariable String genere){
    return filmService.getFilmsByGenere(genere);
  }

  @PostMapping("/create")
  public String createFilm(@ModelAttribute Film film, RedirectAttributes redirectAttributes){
    film = filmService.createFilm(film);
    redirectAttributes.addFlashAttribute("message", "Film " + film.getNome() + " Created");
    return "redirect:/";
  }

  @PutMapping("/update")
  public String updateFilm(@RequestBody Film film){
    film = filmService.createFilm(film);
    return "redirect:/";
  }

  @GetMapping("/delete/{id}")
  public String deleteFilm(@PathVariable int id, RedirectAttributes redirectAttributes){
    Film film = filmService.getFilmById(id);
    if(film != null) {
      filmService.deleteFilm(id);
      redirectAttributes.addFlashAttribute("message", "Film (" + film.getNome() + ") eliminated successfully");
      return "redirect:/";
    }
    redirectAttributes.addFlashAttribute("message", "Error while deleting film id: " + id);
    return "redirect:/";
  }

}
