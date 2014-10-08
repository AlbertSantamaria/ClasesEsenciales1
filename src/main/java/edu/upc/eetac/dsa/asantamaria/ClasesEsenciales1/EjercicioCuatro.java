package edu.upc.eetac.dsa.asantamaria.ClasesEsenciales1;

import java.io.BufferedInputStream;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;

public class EjercicioCuatro {

	EjercicioCuatro() {
	}

	String leerArchivoRegistro(String filename) {

		File archivo = null;

		archivo = new File(filename);

		long len;

		len = LeerCharChar(archivo);

		ObtenerFechaHora ofh = new ObtenerFechaHora();

		String reg = ofh.ArrayFechaHora();

		reg = reg + " " + filename + " " + len + " bytes";

		return reg;

	}

	long LeerCharChar(File archivo) {

		FileInputStream fis = null;
		BufferedInputStream bis = null;
		int c, num = 0;

		try {
			fis = new FileInputStream(archivo);
			bis= new BufferedInputStream(fis);
			
			while ((c = bis.read()) != -1) {
				num++;
			}
		} catch (IOException e) {
		} finally {
			
			System.out.println("El archivo contiene " + num
					+ " bytes recorridos char a char");

			System.out.println("El archivo contiene " + archivo.length()
					+ " bytes ( usando .length() )");

			if (fis != null) {
				try {
					fis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		return num;
	}

	void EscribirRegistro(String reg, String filename) {

		File archivo = new File(filename);
		FileWriter fw = null;
		BufferedWriter bw = null;

		try {

			fw = new FileWriter(archivo, true);
			bw = new BufferedWriter(fw);
			bw.write(reg + "\n");

			bw.close();
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				bw.close();
				fw.close();
			} catch (IOException e) {

				e.printStackTrace();
			}

		}

	}
}
