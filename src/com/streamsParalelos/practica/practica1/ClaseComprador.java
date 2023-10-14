package com.streamsParalelos.practica.practica1;

public enum ClaseComprador {
    BASICA(0.0d),     // (1) Enumera las clases de compradores con sus respectivos rangos de descuento.
    PLATA(0.01d),
    GOLD(0.02d),
    PLATINUM(0.03d);
    
    private final double rango;  // (2) Declara un campo final para almacenar el valor del rango de descuento.

    ClaseComprador(double rango){  // (3) Constructor para asignar un valor de rango a cada clase de comprador.
        this.rango = rango;
    }

    public double getRango() {  // (4) Método para obtener el valor del rango de descuento de una clase de comprador.
        return rango;
    }
}

