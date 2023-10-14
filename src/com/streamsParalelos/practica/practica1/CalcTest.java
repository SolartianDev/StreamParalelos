package com.streamsParalelos.practica.practica1;

import java.util.List;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

public class CalcTest {
    public static void main(String[] args) {

        List<VentasTxn> tList = VentasTxn.createTxnList();  
// (1) Crea una lista de transacciones utilizando el método createTxnList de VentasTxn.

        // Imprimir los totales de transacciones
        System.out.println("=== Totales de Transacciones ===");  
// (2) Muestra un encabezado para los totales de transacciones.

        Stream<VentasTxn> s1 = tList.stream(); 
        // (3) Crea un Stream de objetos VentasTxn a partir de la lista.

        Stream<VentasTxn> s2 = s1.filter(  
// (4) Aplica un filtro a las transacciones para obtener solo las de "MercadoLibre CO".
            t -> t.getCompradorNombre().equals("MercadoLibre CO"));

        DoubleStream s3 = s2.mapToDouble(  
// (5) Mapea las transacciones filtradas a valores de tipo DoubleStream, extrayendo los totales.
            t -> t.getTransaccionTotal());

        double t1 = s3.sum();  
// (6) Calcula la suma de los valores de DoubleStream para obtener el total de MercadoLibre CO.

        System.out.printf("Total de MercadoLibre CO: $%,9.2f%n", t1);  
// (7) Muestra el total de MercadoLibre CO formateado en dólares.
    }
}


