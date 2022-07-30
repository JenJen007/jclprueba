
package com.portfolio.jc.repository;

import com.portfolio.jc.entidad.Persona;
import org.springframework.data.jpa.repository.JpaRepository;


public interface PersonaRepo extends JpaRepository<Persona,Long> {
    
}
