package com.streamsParalelos;

import java.util.Arrays;
import java.util.List;

public class Paralelos {
    public static void main(String[] args) {  // (1) Método principal para ejecutar el código.
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10); 
        // (2) Crea una lista de números del 1 al 10.

        // Operación en paralelo para calcular la suma de los números
        double sumaParalela = numeros.parallelStream() 
        // (3) Inicia un stream paralelo en la lista de números.
                .mapToDouble(Integer::doubleValue) 
        // (4) Convierte los números a tipo double.
                .sum();  
        // (5) Calcula la suma de los números en paralelo.
        
        System.out.println("Suma en paralelo: " + sumaParalela);  
        // (6) Muestra la suma en paralelo.

        // Operación secuencial para calcular la suma de los números
        double sumaSecuencial = numeros.stream()  
        // (7) Inicia un stream secuencial en la lista de números.
                .mapToDouble(Integer::doubleValue)  
        // (8) Convierte los números a tipo double.
                .sequential()  
        // (9) Marca la operación como secuencial (aunque ya lo es por defecto).
                .sum(); 
        // (10) Calcula la suma de los números secuencialmente.
        
        System.out.println("Suma secuencial: " + sumaSecuencial);  
        // (11) Muestra la suma secuencial.

        // Stateless
        numeros.stream()
               .mapToDouble(Integer::doubleValue)
               .parallel()
               .forEach(t -> System.out.println(t));  
        // (12) Imprime cada número en paralelo.

        // Usar métodos como sum(), Collectors, cortocircuito
    }
}

