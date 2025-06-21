package inscripcion_universidad;
import java.util.Scanner;

public class inscripcionUniversitaria {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		
	// *** Inicio del programa de inscripción universitaria ***
		// Mensaje de bienvenida y solicitud de datos
		System.out.println("Bienvenido al sistema de inscripción universitaria.");
		System.out.println("Ingrese el promedio del estudiante: ");
		double promedioEstudiante = scanner.nextDouble();
		
		// Cursos completados
		System.out.println("Ingrese el porcentaje de cursos completados: ");
		double porcentajeCursosCompletados = scanner.nextDouble();
		
		// Pago de matricula
		System.out.println("¿Ha pagado la matrícula? (1 = Sí, 2 = No): ");
		int pagoMatricula = scanner.nextInt();
		
	// *** Variables ***		
		boolean promedioSuperiorA6 = promedioEstudiante >= 6.0;
        boolean promedioEntre5y6 = promedioEstudiante >= 5.5 && promedioEstudiante < 6.0;
        boolean completoCursosPrevios = porcentajeCursosCompletados == 100;
        boolean completo80Porciento = porcentajeCursosCompletados >= 80;
        boolean haPagadoMatricula = (pagoMatricula == 1);
		
		
     // === Evaluar condiciones de inscripción ===
        boolean puedeInscribirse = 
            (promedioSuperiorA6 && completoCursosPrevios && haPagadoMatricula) || (promedioEntre5y6 && completo80Porciento && haPagadoMatricula);

        // === Resultado ===
        if (puedeInscribirse) {
            System.out.println("El estudiante puede inscribirse en el curso.");
        } else {
            System.out.println("El estudiante NO cumple con los requisitos para inscribirse.");
        }

        scanner.close();
		        
	    }
	// Fin del programa
	}