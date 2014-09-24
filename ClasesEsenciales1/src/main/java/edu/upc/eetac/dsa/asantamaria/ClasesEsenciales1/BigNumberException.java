package edu.upc.eetac.dsa.asantamaria.ClasesEsenciales1;

public class BigNumberException extends Exception {

	BigNumberException() {
		super();
	}

	BigNumberException(String cadena) {
		super("BigNumberException " + cadena + " Numero es mayor que 1000");
	}

}
