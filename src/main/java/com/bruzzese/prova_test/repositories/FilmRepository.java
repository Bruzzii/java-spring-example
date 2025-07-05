package com.bruzzese.prova_test.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bruzzese.prova_test.entities.Film;
import java.util.List;


@Repository
public interface FilmRepository extends JpaRepository<Film, Integer> {

  List<Film> findByNomeContaining(String nome);
  List<Film> findByGenere(String genere);

}