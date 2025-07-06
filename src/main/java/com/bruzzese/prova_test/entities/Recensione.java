package com.bruzzese.prova_test.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "recensione")
public class Recensione {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;
  private String titolo;
  private String descrizione;
  private float rating;

  @ManyToOne
  @JoinColumn(name = "film_id")
  private Film film;

}
