package com.bruzzese.prova_test.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bruzzese.prova_test.entities.Recensione;

@Repository
public interface RecensioneRepository extends JpaRepository<Recensione, Integer> {
}
