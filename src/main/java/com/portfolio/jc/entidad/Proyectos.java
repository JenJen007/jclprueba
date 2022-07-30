
package com.portfolio.jc.entidad;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Proyectos {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idProyecto;
    
    @NotNull
    @Size(min = 1, max = 250, message = "no cumple con la longitud")
    private String nombreProyecto;
    
    @NotNull
    @Size(min = 1, max = 250, message = "no cumple con la longitud")
    private String descripProyecto;
     
    private int fechaProyecto;
    
    @NotNull
    @Size(min = 1, max = 250, message = "no cumple con la longitud")
    private String imgProyecto;

    public Proyectos() {
    }

    public Proyectos(Long idProyecto, String nombreProyecto, String descripProyecto, int fechaProyecto, String imgProyecto) {
        this.idProyecto = idProyecto;
        this.nombreProyecto = nombreProyecto;
        this.descripProyecto = descripProyecto;
        this.fechaProyecto = fechaProyecto;
        this.imgProyecto = imgProyecto;
    }
    
    
}
