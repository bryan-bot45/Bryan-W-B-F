/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemasensorvelocidad;

/**
 *
 * @author brayan
 */
public class clsSensorVelocidad {
    private double velocidad;
    private double limite;
    private String numeroAutobus;

    // Constructor
    public SensorVelocidad(double velocidad, double limite, String numeroAutobus) {

        if (velocidad < 0) {
            this.velocidad = 0;
        } else {
            this.velocidad = velocidad;
        }

        if (limite <= 0) {
            this.limite = 80;
        } else {
            this.limite = limite;
        }

        this.numeroAutobus = numeroAutobus;
    }

    // Getter de velocidad
    public double getVelocidad() {
        return velocidad;
    }

    // Setter de velocidad
    public void setVelocidad(double velocidad) {
        if (velocidad >= 0) {
            this.velocidad = velocidad;
        }
    }

    // Getter del límite
    public double getLimite() {
        return limite;
    }

    // Setter del límite
    public void setLimite(double limite) {
        if (limite > 0) {
            this.limite = limite;
        }
    }

    // Getter del número de autobús
    public String getNumeroAutobus() {
        return numeroAutobus;
    }

    // Setter del número de autobús
    public void setNumeroAutobus(String numeroAutobus) {
        this.numeroAutobus = numeroAutobus;
    }

    // Determina si existe exceso de velocidad
    public boolean estaExcedido() {
        return velocidad > limite;
    }

    // Calcula el exceso de velocidad
    public double calcularExceso() {

        if (velocidad > limite) {
            return velocidad - limite;
        }

        return 0;
    }

    // Determina el nivel de riesgo
    public String determinarRiesgo() {

        double exceso = calcularExceso();

        if (exceso == 0) {
            return "Bajo";
        } else if (exceso <= 10) {
            return "Medio";
        } else {
            return "Alto";
        }
    }

    // Muestra el estado del sensor
    public String mostrarEstado() {

        if (estaExcedido()) {
            return "Exceso de velocidad";
        } else {
            return "Velocidad dentro del límite";
        }
    }

    // Método recursivo
    public double sumarVelocidades(double[] velocidades, int posicion) {

        // Caso base
        if (posicion == velocidades.length - 1) {
            return velocidades[posicion];
        }

        // Llamada recursiva
        return velocidades[posicion]
                + sumarVelocidades(velocidades, posicion + 1);
    }
}