package com.AWportfolio.SBportfolio.repository;

import com.AWportfolio.SBportfolio.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepository extends JpaRepository <Persona, Long>{    
    
    Boolean existsByPasswordAndEmail(String password, String email);
}
