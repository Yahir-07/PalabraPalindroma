/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dectectorpalindormo;

/**
 *
 * @author girma
 */

public class DectectorPalindormo {

    
    public static boolean esPalindromo(String palabra) {
        palabra = palabra.toLowerCase().replace(" ", "");
        return esPalindromo(palabra, 0, palabra.length() - 1);
    }

    private static boolean esPalindromo(String palabra, int inicio, int fin) {

       
        if (inicio >= fin) {
            return true;
        }

        
        if (palabra.charAt(inicio) != palabra.charAt(fin)) {
            return false;
        }

        return esPalindromo(palabra, inicio + 1, fin - 1);
    }
    public static void main(String[] args) {
        String palabra1 = "Reconocer";
        String palabra2 = "Perro";
        String frase = "Anita lava la tina";

        System.out.println(palabra1 + " -> " + esPalindromo(palabra1));
        System.out.println(palabra2 + " -> " + esPalindromo(palabra2));
        System.out.println(frase + " -> " + esPalindromo(frase));
    }
}
