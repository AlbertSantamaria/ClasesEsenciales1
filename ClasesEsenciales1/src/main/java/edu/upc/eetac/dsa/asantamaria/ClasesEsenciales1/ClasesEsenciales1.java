package edu.upc.eetac.dsa.asantamaria.ClasesEsenciales1;

/**
 * Clases esenciales 1 (ejercicios del 1 al 7)
 *
 */

public class ClasesEsenciales1 {
	   public static void main(String [] arg) {
	      
	   EjercicioUno e1 = new EjercicioUno();
	   System.out.println("-----------------Fin del Ejercicio 1!");
	   
	   
	   EjercicioDos e2 = new EjercicioDos();
	   System.out.println("-----------------Fin del Ejercicio 2!");
	   
	   
	   EjercicioTres e3 = new EjercicioTres();
	   System.out.println("-----------------Fin del Ejercicio 3!");
	   
	   EjercicioCuatro e4 = new EjercicioCuatro();
	   e4.EscribirRegistro(e4.leerArchivoRegistro("numeros.txt"), "registro.txt");
	   System.out.println("-----------------Fin del Ejercicio 4!");	   
	   
	   EjercicioCuatro e5 = new EjercicioCuatro();
	   e4.EscribirRegistro(e5.leerArchivoRegistro("carta_ajuste.jpg"), "registro.txt");
	   System.out.println("-----------------Fin del Ejercicio 5!");	 
	   }
	   
	}