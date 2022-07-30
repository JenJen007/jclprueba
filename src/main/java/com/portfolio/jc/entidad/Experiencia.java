
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

public class Experiencia {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idExp;
    
    @NotNull
    @Size(min = 1, max = 250, message = "no cumple con la longitud")
     private String nombreExp;
     
    @NotNull
    @Size(min = 1, max = 250, message = "no cumple con la longitud")
    private String cargoExp;
    
    
    private int fechaExpIni;
    
    private int fechaExpFin;
    
    @NotNull
    @Size(min = 1, max = 1400, message = "no cumple con la longitud")
    private String descripExp;
    
    @NotNull
    @Size(min = 1, max = 250, message = "no cumple con la longitud")
    private String imageExp;

    public Experiencia() {
    }

    public Experiencia(Long idExp, String nombreExp, String cargoExp, int fechaExpIni, int fechaExpFin, String descripExp, String imageExp) {
        this.idExp = idExp;
        this.nombreExp = nombreExp;
        this.cargoExp = cargoExp;
        this.fechaExpIni = fechaExpIni;
        this.fechaExpFin = fechaExpFin;
        this.descripExp = descripExp;
        this.imageExp = imageExp;
    }

    
    
    

  
    
    
}
