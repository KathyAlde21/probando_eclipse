package registro_donaciones;


import java.util.Scanner;


public class donaciones {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		// Acumuladores por causa
        int totalSalud = 0;
        int totalEducacion = 0;
        int totalMedioambiente = 0;
        int totalAlimentacion = 0;
        int totalGeneral = 0;

        // Contadores por rango
        int contadorMayor1000 = 0;
        int contadorEntre500y1000 = 0;
        int contadorMenorIgual500 = 0;

        while (true) {
            System.out.print("Ingrese el nombre de la causa de la donación: SALUD, EDUCACION, MEDIOAMBIENTE, ALIMENTACION. \nPara terminar debe escribir FINALIZAR: ");
            String causa = scanner.nextLine().toUpperCase();

            if (causa.equals("FINALIZAR")) {
                break;
            }

            System.out.print("Ingrese el monto de la donación (solo números enteros): ");
            int monto = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer

            // Clasificación por monto
            if (monto > 1000) {
                contadorMayor1000++;
            } else if (monto > 500) {
                contadorEntre500y1000++;
            } else {
                contadorMenorIgual500++;
            }

            // Acumulación por causa
            switch (causa) {
                case "SALUD":
                    totalSalud += monto;
                    break;
                case "EDUCACION":
                    totalEducacion += monto;
                    break;
                case "MEDIOAMBIENTE":
                    totalMedioambiente += monto;
                    break;
                case "ALIMENTACION":
                    totalAlimentacion += monto;
                    break;
                default:
                    System.out.println("⚠️ Causa no válida. La donación no se registró.\n");
                    continue;
            }

            // Acumulación total
            totalGeneral += monto;
        }

        // Mostrar resumen final
        System.out.println("\n== Resumen de Donaciones ==");
        System.out.println("Donaciones mayores a $1000: " + contadorMayor1000);
        System.out.println("Donaciones entre $500 y $1000: " + contadorEntre500y1000);
        System.out.println("Donaciones menores o iguales a $500: " + contadorMenorIgual500);

        System.out.println("\nTotal recaudado por causa:");
        System.out.println("SALUD: $" + totalSalud);
        System.out.println("EDUCACION: $" + totalEducacion);
        System.out.println("MEDIOAMBIENTE: $" + totalMedioambiente);
        System.out.println("ALIMENTACION: $" + totalAlimentacion);

        System.out.println("\nTotal general de donaciones: $" + totalGeneral);

        scanner.close();
	}
}
