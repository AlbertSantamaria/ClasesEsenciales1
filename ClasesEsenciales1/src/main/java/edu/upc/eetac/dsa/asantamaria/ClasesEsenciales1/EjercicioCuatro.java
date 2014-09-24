package edu.upc.eetac.dsa.asantamaria.ClasesEsenciales1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class EjercicioCuatro {

	EjercicioCuatro() {
	}

	String leerArchivoRegistro(String filename) {

		File archivo = null;

		archivo = new File(filename);

		long len;

		len = archivo.length(); //falta cambiar esto por recorrer byte a byte

		ObtenerFechaHora ofh = new ObtenerFechaHora();

		String reg = ofh.ArrayFechaHora();

		reg = reg + " " + filename + " " + len + " bytes";

		return reg;

	}

	void EscribirRegistro(String reg,String filename) {

		File archivo = new File(filename);
		FileWriter fw = null;
		BufferedWriter bw = null;

		try {

			fw = new FileWriter(archivo, true);
			bw = new BufferedWriter(fw);
			bw.write(reg+"\n");

			bw.close();
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				bw.close();
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}
}
