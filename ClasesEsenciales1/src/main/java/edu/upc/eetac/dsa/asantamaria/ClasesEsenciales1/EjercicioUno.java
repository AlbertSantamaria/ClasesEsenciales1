package edu.upc.eetac.dsa.asantamaria.ClasesEsenciales1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class EjercicioUno {

	EjercicioUno() {

		File archivo = new File("numeros.txt");
		FileReader fr = null;

		try {
			fr = new FileReader(archivo);
			BufferedReader br = new BufferedReader(fr);

			// Lectura del fichero
			String linea;

			while ((linea = br.readLine()) != null) {

				System.out.println(linea);
			}
			br.close();
			
		} catch (Exception e1) {
			e1.printStackTrace();

		}
	}
}