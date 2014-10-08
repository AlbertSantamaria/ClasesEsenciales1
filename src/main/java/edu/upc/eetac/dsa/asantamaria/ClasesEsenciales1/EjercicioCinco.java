package edu.upc.eetac.dsa.asantamaria.ClasesEsenciales1;

import java.io.BufferedInputStream;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;

public class EjercicioCinco {

	EjercicioCinco() {
	}

	String leerArchivoRegistro(String filename) {

		File archivo = null;

		archivo = new File(filename);

		long len;

		len = LeerByteaByte(archivo);

		ObtenerFechaHora ofh = new ObtenerFechaHora();

		String reg = ofh.ArrayFechaHora();

		reg = reg + " " + filename + " " + len + " bytes";

		return reg;

	}

	long LeerByteaByte(File archivo) {

		FileInputStream fis = null;
		BufferedInputStream bis = null;
		int num = 0;

		try {
			fis = new FileInputStream(archivo);
			bis = new BufferedInputStream(fis);

			int pre = bis.read();

			while (pre != -1) {
				num++;
				pre = bis.read();

			}
		} catch (IOException e) {
		} finally {
			System.out.println("El archivo contiene " + num
					+ " bytes recorridos uno a uno");

			System.out.println("El archivo contiene " + archivo.length()
					+ " bytes ( usando .length() )");

			if (fis != null) {
				try {
					bis.close();
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
