package com.bruzzese.prova_test.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bruzzese.prova_test.entities.Recensione;
import com.bruzzese.prova_test.services.RecensioneService;

@Controller
@RequestMapping("/api/recensione")
public class RecensioneController {

  @Autowired
  private RecensioneService recensioneService;

  @PostMapping("/create")
  public String createRecensione(@ModelAttribute Recensione recensione) {
    recensioneService.createRecensione(recensione);
    return "redirect:/film/" + recensione.getFilm().getId() + "/recensioni/" ;
  }

  @GetMapping("/delete/{id}")
  public String deleteRecensione(@PathVariable int id) {
    int film_id = recensioneService.getRecensione(id).getFilm().getId();
    recensioneService.deleteRecensione(id);
    return "redirect:/film/" + film_id + "/recensioni/" ;
  }

}
