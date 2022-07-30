
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
public class Educacion {
     @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idEdu;
    
    @NotNull
    @Size(min = 1, max = 250, message = "no cumple con la longitud")
    private String nombreEdu;
    
 
    @NotNull
    @Size(min = 1, max = 250, message = "no cumple con la longitud")
    private String tituloEdu;
    
    @NotNull
    @Size(min = 1, max = 250, message = "no cumple con la longitud")
    private String imageEdu;
    
    private int fechaEduFin;
    
    private int fechaEduIni;

    public Educacion() {
    }

    public Educacion(Long idEdu, String nombreEdu, String tituloEdu, String imageEdu, int fechaEduFin, int fechaEduIni) {
        this.idEdu = idEdu;
        this.nombreEdu = nombreEdu;
        this.tituloEdu = tituloEdu;
        this.imageEdu = imageEdu;
        this.fechaEduFin = fechaEduFin;
        this.fechaEduIni = fechaEduIni;
    }

    

   
    

   
    
    

}
