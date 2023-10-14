
package com.streamsParalelos.practica.practica3;

import com.streamsParalelos.practica.practica1.*;

public enum Departamento {
    DC("Bogotá DC"),
    ANT("Antioquia"),
    BOY("Boyacá");
    
    private final String departamento;

    Departamento(String depart) {
        this.departamento= depart;
    }

    public String getDepartamento() {
        return departamento;
    }

 
}
