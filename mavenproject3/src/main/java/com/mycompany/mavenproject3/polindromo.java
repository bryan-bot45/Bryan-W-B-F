/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject3;

/**
 *
 * @author Bryan wymer benitez
 */
public class polindromo {

    // Método Wrapper (Público)
    public boolean esPalindromo(String palabra) {
        return esPalindromoAuxiliar(palabra, 0, palabra.length() - 1);
    }
    // Método Recursivo Auxiliar (Privado) 🔄
    private boolean esPalindromoAuxiliar(String palabra, int inicio, int fin) {
        // 1. Caso Base: Si los índices se cruzaron o son iguales, es palíndromo
        if (inicio >= fin) {
            return true;
        }
        // 2. Caso Base: Si los caracteres no coinciden, no es palíndromo
        if (palabra.charAt(inicio) != palabra.charAt(fin)) {
            return false;
        }
        // 3. Paso Recursivo: Avanzamos hacia el centro
        return esPalindromoAuxiliar(palabra, inicio + 1, fin - 1);
    }
}
    
