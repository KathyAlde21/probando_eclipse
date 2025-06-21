package expresiones_logicas;

public class expresionesLogicas {

	public static void main(String[] args) {
		
		// primer ejemplo de expresiones logicas => VERDADERO
		// V1 = ((5 > 3) Y (Largo("Computación") = 11))
        boolean v1 = (5 > 3) && ("Computación".length() == 11); //true
        System.out.println("V1 = ((5 > 3) Y (Largo(\"Computación\") = 11)) → " + v1);	
		
        // segundo ejemplo de expresiones logicas => VERDADERO
        // V2 = No((4 + 3 <= 6) O ((10 = 10) Y (8 < 2)))
        boolean parte1 = (4 + 3 <= 6); // false
        boolean parte2 = (10 == 10) && (8 < 2); // true && false = false
        boolean v2 = !(parte1 || parte2); // !(false || false) = true
        System.out.println("V2 = No((4 + 3 <= 6) O ((10 = 10) Y (8 < 2))) → " + v2);
		
        // tercer ejemplo de expresiones logicas => VERDADERO
        // V3 = (((3 * 2) <> 6) O ((9 - 4) >= 5 Y (2 + 2 = 4)))
        boolean parte3 = (3 * 2 != 6); // false
        boolean parte4 = ((9 - 4) >= 5) && (2 + 2 == 4); // true && true = true
        boolean v3 = (parte3 || parte4); // false || true = true
        System.out.println("V3 = (((3 * 2) <> 6) O ((9 - 4) >= 5 Y (2 + 2 = 4))) → " + v3);
        
	}

}
