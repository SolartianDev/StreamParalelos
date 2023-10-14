package com.streamsParalelos.practica.practica1;

public enum Departamento {
    DC("Bogotá DC"),   // Enumerado para el departamento de Bogotá DC
    ANT("Antioquia"),  // Enumerado para el departamento de Antioquia
    BOY("Boyacá");     // Enumerado para el departamento de Boyacá
    
    private final String departamento;

    // Constructor que inicializa el atributo 'departamento' con el nombre del departamento
    Departamento(String depart) {
        this.departamento = depart;
    }

    // Método para obtener el nombre del departamento
    public String getDepartamento() {
        return departamento;
    }
}
