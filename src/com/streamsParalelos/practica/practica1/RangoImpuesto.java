package com.streamsParalelos.practica.practica1;

public enum RangoImpuesto {
    DC(0.09d),   // Enumerado para Bogotá DC con un rango de impuestos del 9%
    ANT(0.09d),  // Enumerado para Antioquia con un rango de impuestos del 9%
    BOY(0.08d);  // Enumerado para Boyacá con un rango de impuestos del 8%

    private final double rango;

    // Constructor que inicializa el atributo 'rango' con el valor de impuestos correspondiente
    private RangoImpuesto(double rango) {
        this.rango = rango;
    }

    // Método para obtener el valor del rango de impuestos
    public double getRango() {
        return rango;
    }

    // Método estático que devuelve el valor del rango de impuestos para un departamento dado
    public static double porDepartamento(Departamento d) {
        double rango = 0.0d;

        // Utiliza un switch para asignar el rango de impuestos según el departamento
        switch (d) {
            case DC:
                rango = DC.getRango();
                break;
            case ANT:
                rango = ANT.getRango();
                break;
            case BOY:
                rango = BOY.getRango();
                break;
        }
        return rango;
    }
}
