package com.bruzzese.prova_test.entities;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "film")
@Data
public class Film {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;
  private String nome;
  private int anno;
  private String genere;
  private float rating;

  @OneToMany(mappedBy = "film", cascade = CascadeType.ALL, orphanRemoval = true)
  private List<Recensione> recensioni = new ArrayList<>();

}
