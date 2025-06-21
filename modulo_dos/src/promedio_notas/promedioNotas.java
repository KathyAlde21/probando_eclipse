package promedio_notas;

import java.util.Scanner;


public class promedioNotas {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
	
		// Mensaje de bienvenida
		System.out.println("Bienvenido al programa de cálculo del promedio de notas.");
		System.out.println("Por favor, ingrese los datos requeridos para cada estudiante.");
		System.out.println(" ");
		

		//*** Inicio del programa de cálculo de promedios de notas ***
		
		// Cantidad de estudiantes
        System.out.println("Ingrese la cantidad de estudiantes a procesar: ");
        int cantidadEstudiantes = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer

        System.out.println(" ");
        System.out.println("La cantidad ingresada de estudiantes es: " + cantidadEstudiantes);
      //  System.out.println(" ");
		System.out.println("Por favor, ingrese los datos requeridos para cada estudiante.");
        // Se deben pedir los datos para cada estudiante
        for (int i = 1; i <= cantidadEstudiantes; i++) {
            System.out.println("\nEstudiante #" + i);		
            
            
            // Solicitar nombre y edad del estudiante
            System.out.print("Nombre: ");
            String nombre = scanner.nextLine();
            
            System.out.print("Edad: ");
            int edad = scanner.nextInt();
            
            // Solicitar 3 notas
            System.out.print("Nota 1: ");
            double nota1 = scanner.nextDouble();

            System.out.print("Nota 2: ");
            double nota2 = scanner.nextDouble();

            System.out.print("Nota 3: ");
            double nota3 = scanner.nextDouble();
            scanner.nextLine(); // Limpiar el buffer

         //**********************************************
            //*** Calculo de promedio y rendimiento ***
            double promedio = (nota1 + nota2 + nota3) / 3;


            String rendimiento;
            if (promedio >= 6.5) {
                rendimiento = "Excelente";
            } else if (promedio >= 4.0) {
                rendimiento = "Aceptable";
            } else {
                rendimiento = "Insuficiente";
            }

            // Mostrar resultados del estudiante
            System.out.println(" ");
			System.out.println("Resultados del estudiante N° " + i + ": " + nombre);
           // System.out.printf("Datos del estudiante %d:\n", i + " son:");
           // System.out.printf("Datos del estudiante %s:\n", nombre);
            System.out.println("Edad: " + edad);
            System.out.printf("Promedio: %.2f\n", promedio);
            System.out.println("Rendimiento: " + rendimiento);
        }

		//*** Fin del programa de cálculo de promedios de notas ***
		scanner.close();

	}

}
