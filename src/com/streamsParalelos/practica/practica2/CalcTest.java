package com.streamsParalelos.practica.practica2;

import java.util.List;

public class CalcTest {
    public static void main(String[] args) {

        List<VentasTxn> tList = VentasTxn.createTxnList();  
// (1) Crea una lista de transacciones (VentasTxn).

        // Print out Transaction Totals
        System.out.println("=== Transacciones Totales ===");  
// (2) Muestra un encabezado.

        double t1 = tList.parallelStream()
            .filter(t -> t.getCompradorNombre().equals("MercadoLibre CO"))
            .mapToDouble( t -> t.getTransaccionTotal())
            .sum();  
// (3) Realiza operaciones en paralelo para calcular el total de transacciones de "MercadoLibre CO".

        System.out.printf("MercadoLibre CO Total: $%,9.2f%n", t1);  
// (4) Muestra el resultado del total de transacciones para "MercadoLibre CO".

        double t2 = tList.stream()
            .filter(t -> t.getCompradorNombre().equals("Electronics CO"))
            .mapToDouble( t -> t.getTransaccionTotal())
            .parallel()
            .sum();  
// (5) Realiza operaciones en paralelo para calcular el total de transacciones de "Electronics CO".

        System.out.printf("Electronics CO Total: $%,9.2f%n", t2);  
// (6) Muestra el resultado del total de transacciones para "Electronics CO".

        double t3 = tList.stream()
            .filter(t -> t.getCompradorNombre().equals("Aseo SA"))
            .mapToDouble( t -> t.getTransaccionTotal())
            .sequential()
            .sum();  
// (7) Realiza operaciones secuenciales para calcular el total de transacciones de "Aseo SA".

        System.out.printf("Aseo SA Total: $%,9.2f%n", t3);  
// (8) Muestra el resultado del total de transacciones para "Aseo SA".
    }
}


