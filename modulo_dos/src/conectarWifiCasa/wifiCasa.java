package conectarWifiCasa;

import java.util.Scanner;

public class wifiCasa {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	
	
	//definiendo datos de conexión
	final String NOMBRE_RED = "casa"; // Simulando el nombre de la red Wifi
	final String CONTRASENA_CORRECTA = "1234"; // Simulando la contraseña correcta
	
	int intentos = 0;
    final int MAX_INTENTOS = 3;
    boolean conectado = false;
		

		//** Inicio del programa de conexión a la red Wifi de la casa ***
		while (intentos < MAX_INTENTOS && !conectado) {
			System.out.println("Bienvenido!! Para poder acceder a la red Wifi debe ingresar el nombre de la red y la contraseña correcta.");
			System.out.println("Si no logra conectarse en tres intentos, el sistema será bloqueado por múltiples intentos fallidos.");
			
			System.out.println("Ingresa el nombre de la red Wifi: ");
			String nombreRed = scanner.nextLine(); // Simulando el nombre de la red Wifi

			if (!nombreRed.equals(NOMBRE_RED)) {
				System.out.println("Error: la red Wifi '" + nombreRed + "' no existe. Inténtalo de nuevo. " + (MAX_INTENTOS - intentos - 1) + " intentos restantes.");
				System.out.println(" ");
				intentos++; // Incrementar el contador de intentos
	
			} else {
				System.out.println("Ingresa la contraseña de la red Wifi: ");
				String ingresoContrasena = scanner.nextLine(); // Simulando la entrada del usuario
							
				if (ingresoContrasena.equals(CONTRASENA_CORRECTA)) {
					System.out.println("Conexión exitosa a la red Wifi '" + nombreRed + "'!");
					conectado = true; // Conexión exitosa
				} else {
					System.out.println("Error: Contraseña incorrecta. Inténtalo de nuevo. "+ (MAX_INTENTOS - intentos - 1) + " intentos restantes.");
					System.out.println(" ");
					intentos++; // Incrementar el contador de intentos
				}
			}
		}
		//** Fin del programa de conexión a la red Wifi de la casa ***

		// Mensaje final
		if (!conectado && intentos < MAX_INTENTOS) {
			System.out.println("Intentos restantes: " + (MAX_INTENTOS - intentos));
		}
		// Mensaje de bloqueo si se alcanzan los intentos máximos		
		if (!conectado) {
			System.out.println("Demasiados intentos fallidos. El sistema ha sido bloqueado.");
		}
		// Cierre del escáner
		scanner.close();

		}			
	}

