
package com.portfolio.jc.repository;

import com.portfolio.jc.entidad.Educacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EducacionRepo extends JpaRepository<Educacion,Long>{
    
}
