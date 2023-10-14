package com.streamsParalelos.practica.practica1;

import java.util.HashMap;
import java.util.Map;

public class Comprador {
    
    private String nombre;
    private ClaseComprador claseComprador;

    public Comprador(String nombre, ClaseComprador claseComprador) {
        this.nombre = nombre;
        this.claseComprador = claseComprador;
    }
    
    public static Comprador getInstancia(String nombre, ClaseComprador claseComprador) {
       return new Comprador(nombre, claseComprador);
    }
    
    public static Map<String, Comprador> getMapComprador() {
        // Crea un mapa para almacenar objetos Comprador asociados a nombres de categoría.
        Map<String, Comprador> mapComprador = new HashMap<>();
        
        // Agrega instancias de Comprador con nombres de categoría y clases asociadas.
        mapComprador.put
        ("Electronics", Comprador.getInstancia("Electronics CO", ClaseComprador.PLATA));
        mapComprador.put
        ("Hogar", Comprador.getInstancia("Hogar CO", ClaseComprador.GOLD));
        mapComprador.put
        ("Herramienta", Comprador.getInstancia("Herramientas CO", ClaseComprador.BASICA));
        mapComprador.put
        ("MercadoLibre", Comprador.getInstancia("MercadoLibre CO", ClaseComprador.BASICA));
        mapComprador.put
        ("Aseo", Comprador.getInstancia("Aseo SA", ClaseComprador.PLATINUM));
        mapComprador.put
        ("Camisas", Comprador.getInstancia("Camisas y Pantalones SA", ClaseComprador.PLATA));
        
        // Devuelve el mapa que contiene las asociaciones de categoría y Comprador.
        return mapComprador;
    }

    public String getNombre() {
        return nombre;
    }

    public ClaseComprador getClaseComprador() {
        return claseComprador;
    }
}
