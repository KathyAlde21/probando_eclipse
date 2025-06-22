package puntajes_invertidos_estudiantes;

import java.util.Arrays;
import java.util.Scanner;


public class puntajesEstudiantes {


	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		// Acumuladores de puntajes
		int[] puntajes = new int[8];

		// Solicitar los puntajes
        for (int i = 0; i < puntajes.length; i++) {
        	System.out.println("Bienvenido al registro de puntajes en la primera ronda de la competencia deportiva.");
            System.out.print("En una escala de 1 a 10 ingrese el puntaje del Participante " + (i + 1) + ": ");
            puntajes[i] = scanner.nextInt();
        }

        // Invertir las posiciones del vector
        for (int i = 0; i < puntajes.length / 2; i++) {
            int temp = puntajes[i];
            puntajes[i] = puntajes[puntajes.length - 1 - i];
            puntajes[puntajes.length - 1 - i] = temp;
        }

        //*****************************************************************
        // Mostrar el vector reorganizado con relación al nuevo orden
        System.out.println("\nPuntajes reorganizados:");
        for (int i = 0; i < puntajes.length; i++) {
        	int participanteOriginal = puntajes.length - i;
            System.out.println("Participante " + participanteOriginal + ": " + puntajes[i]);
        }
        
        //*****************************************************************
        // Ordenar y mostrar los puntajes de mayor a menor
        System.out.println("\nEste es el orden de los participantes según sus puntajes ordenados de mayor a menor:");                                                                                                                                

        int[] copiaPuntajes = Arrays.copyOf(puntajes, puntajes.length);
        Arrays.sort(copiaPuntajes);
        
        for (int i = copiaPuntajes.length - 1; i >= 0; i--) {
            int puntaje = copiaPuntajes[i];
            // Buscar a qué participante original corresponde
            for (int j = 0; j < puntajes.length; j++) {
                if (puntajes[j] == puntaje) {
                    int participanteOriginal = puntajes.length - j;
                    System.out.println("Puntaje N° " + (copiaPuntajes.length - i) + ": " + puntaje + " (Participante " + participanteOriginal + ")");
                    puntajes[j] = -1; // Marcar como usado para evitar duplicados en caso de puntajes iguales
                    break;
                }
            }
        }
        
        System.out.println("\nGracias por participar en la competencia deportiva. ¡Hasta la próxima!");
        //*****************************************************************

        scanner.close();

	}

}
