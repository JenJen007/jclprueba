
package com.portfolio.jc.controller;

import com.portfolio.jc.entidad.Persona;
import com.portfolio.jc.services.PersonaService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/persona")
public class PersonaController {
    private final PersonaService personaService;
    
    public PersonaController(PersonaService personaService){
        this.personaService = personaService;
    }
    @GetMapping("/id/{id}")
    public ResponseEntity<Persona> obtenerPersona(@PathVariable("id")Long id){
        Persona persona=personaService.buscarPersonaPorId(id);
        return new ResponseEntity<>(persona, HttpStatus.OK);
    }
    @PutMapping("/update")
    public ResponseEntity<Persona> editarPersona(@RequestBody Persona persona){
        Persona updatePersona=personaService.editarPersona(persona);
        return new ResponseEntity<>(updatePersona,HttpStatus.OK);
    }
}
