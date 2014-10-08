package edu.upc.eetac.dsa.asantamaria.ClasesEsenciales1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class EjercicioDos {

	EjercicioDos() {

		File archivo = new File("numeros.txt");
		FileReader fr = null;
		String linea;
		int c=0;

		try {
			fr = new FileReader(archivo);
			BufferedReader br = new BufferedReader(fr);

			// Lectura del fichero

			while ((linea = br.readLine()) != null) {

				if ((Integer.parseInt(linea)) >= 1000) {
					throw new BigNumberException(linea);
				}

				System.out.print(linea + ", ");
				c++;
				if (c == 6) {

					System.out.print("\n");
					c = 0;
				}
			}
			System.out.print("\n");
			br.close();
			fr.close();
		} catch (BigNumberException e1) {
			e1.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
