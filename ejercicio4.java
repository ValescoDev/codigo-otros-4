package com.generation;


//El código es un juego de piedra, papel o tijeras para dos jugadores. Cada jugador introduce su elección y se compara para determinar quien es ganador.

import java.util.Scanner; 

// Se agregó la importación de Scanner

public class Codigo4 {

public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
    String j1 = s.nextLine();
    
    System.out.print("Turno del jugador 2 (introduzca piedra, papel o tijeras): ");
    String j2 = s.nextLine();

    // Se cambió el segundo mensaje de introducción para el jugador 2, que antes decía "Turno del jugador 1".
    // se cambió el uso de la comparación == por equals
    if (j1.equals(j2)) {
        // Se cambió el paréntesis adicional en la línea del if que comparaba j1 y j2.
        System.out.println("Empate"); 
    } else {
        int g = 2;
        switch(j1) {
            case "piedra":
                if (j2.equals("tijeras")) {
                    g = 1;
                }
                break;
                // Se agregó el break dentro de cada case del switch para evitar que se ejecuten las comparaciones innecesarias.
            case "papel":
                if (j2.equals("piedra")) {
                    g = 1;
                }
                break;
            case "tijeras":
                if (j2.equals("papel")) {
                    g = 1;
                }
                break;
            default:
                System.out.println("Eleccion invalida");
                break;
                // Se agregó un default para manejar los casos en que los jugadores eligen una opción que no está en la lista.
        }
        System.out.println("Gana el jugador " + g);
    }
}

}

