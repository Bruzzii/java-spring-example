package com.bruzzese.prova_test.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bruzzese.prova_test.services.FilmService;

@Controller
@RequestMapping("/")
public class PageController {

  @Autowired
  private FilmService filmService;

  @GetMapping("/")
  public String index(Model model, @RequestAttribute(required = false) String message){
    model.addAttribute("films", filmService.getFilms());
    return "index";
  }

  @GetMapping("/create/film")
  public String createFilm(Model model){
    return "create_film";
  }

  @GetMapping("/film/{id}/recensioni/")
  public String recensioniFilm(Model model, @PathVariable int id){
    model.addAttribute("film", filmService.getFilmById(id));
    return "recensioni";
  }

}
