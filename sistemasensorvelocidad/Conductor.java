/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemasensorvelocidad;

/**
 * Clase que representa a un conductor.
 * Hereda los datos de la clase Persona.
 *
 * @author Brayan Bautista
 */
public class Conductor extends persona {

    // Atributo propio del conductor
    private String numeroLicencia;

    // Constructor
    public Conductor(String nombre, String numeroLicencia) {
        super(nombre);
        this.numeroLicencia = numeroLicencia;
    }

    // Getter
    public String getNumeroLicencia() {
        return numeroLicencia;
    }

    // Setter
    public void setNumeroLicencia(String numeroLicencia) {
        this.numeroLicencia = numeroLicencia;
    }
}