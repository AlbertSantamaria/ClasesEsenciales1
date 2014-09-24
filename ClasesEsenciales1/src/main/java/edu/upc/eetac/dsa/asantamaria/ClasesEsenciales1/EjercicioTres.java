package edu.upc.eetac.dsa.asantamaria.ClasesEsenciales1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class EjercicioTres {

	EjercicioTres() {

		File archivo = new File("numeros.txt");
		FileReader fr = null;
		BufferedReader br = null;

		try {
			fr = new FileReader(archivo);
			br = new BufferedReader(fr);

			// Lectura del fichero
			String linea;

			while ((linea = br.readLine()) != null) {

				System.out.println(linea);

				// Este metodo hace saltar BigNumberException a diferencia del
				// ejercicio 2

				controlNumMax((Integer.parseInt(linea)));
			}
		} catch (Exception e1) {

			e1.printStackTrace();

		} finally {
			// En el finally cerramos el fichero, para asegurarnos que se cierra
			// tanto si todo va bien como si salta alguna excepción

			try {
				if (null != fr) {
					br.close();
					fr.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}

	// Metodo para lanzar la excepción

	public void controlNumMax(int num) throws BigNumberException {

		if (num >= 1000) {

			throw new BigNumberException(Integer.toString(num));
		}

	}
}