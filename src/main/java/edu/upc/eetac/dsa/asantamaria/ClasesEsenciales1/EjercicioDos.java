package edu.upc.eetac.dsa.asantamaria.ClasesEsenciales1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class EjercicioDos {

	EjercicioDos() {

		File archivo = new File("numeros.txt");
		FileReader fr = null;
		String linea;

		try {
			fr = new FileReader(archivo);
			BufferedReader br = new BufferedReader(fr);

			// Lectura del fichero

			while ((linea = br.readLine()) != null) {

				if ((Integer.parseInt(linea)) >= 1000) {
					throw new BigNumberException(linea);
				}
				System.out.println(linea);
			}
			br.close();
			fr.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
