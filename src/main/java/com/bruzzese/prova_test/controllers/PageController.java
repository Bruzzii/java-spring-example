package com.bruzzese.prova_test.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bruzzese.prova_test.services.FilmService;

@Controller
@RequestMapping("/")
public class PageController {

  @Autowired
  private FilmService filmService;

  @GetMapping("/")
  public String index(Model model){
    model.addAttribute("films", filmService.getFilms());
    return "index";
  }

}
