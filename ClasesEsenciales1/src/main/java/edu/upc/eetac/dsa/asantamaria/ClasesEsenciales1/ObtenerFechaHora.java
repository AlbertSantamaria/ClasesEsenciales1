package edu.upc.eetac.dsa.asantamaria.ClasesEsenciales1;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class ObtenerFechaHora {

	ObtenerFechaHora() {
	}

	void MostrarFechaHora() {
		// Instanciamos el objeto Calendar
		// en fecha obtenemos la fecha y hora del sistema

		Calendar fecha = new GregorianCalendar();

		// Obtenemos el valor del año, mes, día,
		// hora, minuto y segundo del sistema
		// usando el método get y el parámetro correspondiente

		int año = fecha.get(Calendar.YEAR);
		int mes = fecha.get(Calendar.MONTH);
		int dia = fecha.get(Calendar.DAY_OF_MONTH);
		int hora = fecha.get(Calendar.HOUR_OF_DAY);
		int minuto = fecha.get(Calendar.MINUTE);
		int segundo = fecha.get(Calendar.SECOND);
		System.out
				.println("Fecha Actual: " + dia + "/" + (mes + 1) + "/" + año);
		System.out.printf("Hora Actual: %02d:%02d:%02d %n", hora, minuto,
				segundo);
	}

	String ArrayFechaHora() {
		// Instanciamos el objeto Calendar
		// en fecha obtenemos la fecha y hora del sistema

		String reg = "";
		Calendar fecha = new GregorianCalendar();

		int int_año = fecha.get(Calendar.YEAR);
		int int_mes = fecha.get(Calendar.MONTH);
		int int_dia = fecha.get(Calendar.DAY_OF_MONTH);
		int int_hora = fecha.get(Calendar.HOUR_OF_DAY);
		int int_minuto = fecha.get(Calendar.MINUTE);
		int int_segundo = fecha.get(Calendar.SECOND);

		// Obtenemos el valor del año, mes, día,
		// hora, minuto y segundo del sistema
		// usando el método get y el parámetro correspondiente
		String año = paddingStrings(int_año, "0", 4);
		String mes = paddingStrings(int_mes, "0", 2);
		String dia = paddingStrings(int_dia, "0", 2);
		String hora = paddingStrings(int_hora, "0", 2);
		String minuto = paddingStrings(int_minuto, "0", 2);
		String segundo = paddingStrings(int_segundo, "0", 2);

		reg = dia + "/" + mes + "/" + año + " " + hora + ":" + minuto + ":"
				+ segundo;

		// System.out.println(reg);

		return reg;

	}

	public String paddingStrings(int val, String pad, int len) {
		// Convierte int a String y añade el padding de 0's

		String str = Integer.toString(val);
		while (str.length() < len)
			str = pad + str;
		return str;
	}
}
