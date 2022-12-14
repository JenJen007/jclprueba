
package com.portfolio.jc.services;

import com.portfolio.jc.entidad.Persona;
import com.portfolio.jc.exception.UserNotFoundException;
import com.portfolio.jc.repository.PersonaRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class PersonaService {
    private final PersonaRepo personaRepo;
    
    @Autowired
    public PersonaService(PersonaRepo personaRepo){
        this.personaRepo = personaRepo;
    }
    
    public Persona addPersona(Persona persona){
        return personaRepo.save(persona);
    }
    public List<Persona> buscarPersona(){
        return personaRepo.findAll();
    }
    public Persona editarPersona(Persona persona){
        return personaRepo.save(persona);
    }
    public void borrarPersona(Long id){
        personaRepo.deleteById(id);
    }
    public Persona buscarPersonaPorId(Long id){
        return personaRepo.findById(id).orElseThrow(()->new UserNotFoundException("persona no encontrada"));
    }
}
