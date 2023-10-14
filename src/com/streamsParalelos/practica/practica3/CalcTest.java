package com.streamsParalelos.practica.practica3;

import java.util.List;

public class CalcTest {
    public static void main(String[] args) {

        List<VentasTxn> tList = VentasTxn.createTxnList();  
// (1) Crea una lista de transacciones (VentasTxn).

        // Print out Transaction Totals
        System.out.println("=== Transacciones Totales ===");  
// (2) Muestra un encabezado.

        double t2 = tList.stream()
            .filter(t -> t.getCompradorNombre().equals("MercadoLibre CO"))
            .mapToDouble( t -> t.getTransaccionTotal())
            .parallel()
            .reduce(0, (sum, e) -> sum + e);  
// (3) Realiza operaciones en paralelo para calcular el total de transacciones de "MercadoLibre CO" utilizando la operación reduce para sumar los valores.

        System.out.println("MercadoLibre CO Total: "+ t2);  
// (4) Muestra el resultado del total de transacciones para "MercadoLibre CO".

        double c2 = tList.stream()
            .filter(t -> t.getCompradorNombre().equals("Camisas y Pantalones SA"))
            .mapToDouble(t -> t.getTransaccionTotal())
            .parallel()
            .reduce(0, (sum, e) -> sum + e);  
// (5) Realiza operaciones en paralelo para calcular el total de transacciones de "Camisas y Pantalones SA" utilizando la operación reduce para sumar los valores.

        System.out.println("Camisas y Pantalones SA Transacciones: "+ c2);  
// (6) Muestra el resultado del total de transacciones para "Camisas y Pantalones SA".
    }
}
