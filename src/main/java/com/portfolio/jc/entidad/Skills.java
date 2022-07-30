
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
public class Skills {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idSkill;
    
    
    
    private String nombreSkill;
  
    @NotNull
    @Size(min = 1, max = 250, message = "no cumple con la longitud")
    private int porcentaje;
    
    
    private int radio;
    
    private int anchoTrazo;
    
    private String colorTrazo;
    
    @NotNull
    @Size(min = 1, max = 250, message = "no cumple con la longitud")
    private String imgSkill;
    
    private int imgAlto;
    
    private int imgAncho;
    
    private boolean showImg;
    
    private boolean showFondo;
    
    private boolean animacion;
    
    private int animacionTime;
    

    public Skills() {
    }

    public Skills(Long idSkill, String nombreSkill, int porcentaje, int radio, int anchoTrazo, String colorTrazo, String imgSkill, int imgAlto, int imgAncho, boolean showImg, boolean showFondo, boolean animacion, int animacionTime) {
        this.idSkill = idSkill;
        this.nombreSkill = nombreSkill;
        this.porcentaje = porcentaje;
        this.radio = radio;
        this.anchoTrazo = anchoTrazo;
        this.colorTrazo = colorTrazo;
        this.imgSkill = imgSkill;
        this.imgAlto = imgAlto;
        this.imgAncho = imgAncho;
        this.showImg = showImg;
        this.showFondo = showFondo;
        this.animacion = animacion;
        this.animacionTime = animacionTime;
    }

   
    
    
}
