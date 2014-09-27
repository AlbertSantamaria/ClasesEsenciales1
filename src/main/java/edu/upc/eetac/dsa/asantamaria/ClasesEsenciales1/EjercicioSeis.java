package edu.upc.eetac.dsa.asantamaria.ClasesEsenciales1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class EjercicioSeis {

	EjercicioSeis() {
	}

	void MaxRegistro() {

		File archivo = null;

		archivo = new File("registro.txt");

		FileReader fr = null;
		BufferedReader br = null;

		// int i;
		String linea;
		// String delimitadores = "[ .,;?!¡¿\'\"\\[\\]]+";
		String[] palabrasSeparadas1;
		String[] palabrasSeparadas2 = { "", "", "", "0", "" };

		try {
			fr = new FileReader(archivo);
			br = new BufferedReader(fr);

			// Lectura del fichero

			while ((linea = br.readLine()) != null) {

				palabrasSeparadas1 = linea.split(" ");

				if (Integer.parseInt(palabrasSeparadas1[3]) >= Integer
						.parseInt(palabrasSeparadas2[3])) {
					palabrasSeparadas2 = palabrasSeparadas1;

					// for (i = 0; i < palabrasSeparadas2.length; i++) {
					// System.out.print(palabrasSeparadas2[i]+" ");
					// }
					// System.out.println("");
				}
			}
			System.out.println("");
			
			System.out.println("El archivo de mayor tamaño del registro es:\n"
					+ "-->"+palabrasSeparadas2[2] + " con un tamaño de "
					+ palabrasSeparadas2[3] + " bytes \n"
					+ "-->Fue registrado el " + palabrasSeparadas2[0] + " a las "
					+ palabrasSeparadas2[1]);
			
			System.out.println("");
			
		} catch (Exception e1) {

			e1.printStackTrace();

		}finally {
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
}
