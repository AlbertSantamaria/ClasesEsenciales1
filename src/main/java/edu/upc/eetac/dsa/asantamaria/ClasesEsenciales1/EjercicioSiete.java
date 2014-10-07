package edu.upc.eetac.dsa.asantamaria.ClasesEsenciales1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class EjercicioSiete {

	
	EjercicioSiete(){
		System.out.println("");
		System.out.println("[----] Instanciando 4 Objetos:");
		System.out.println("");
		
		Dato d1=new Dato(5,"Hola",'A');
		Dato d2=new Dato(4,"que",'B');	
		Dato d3=new Dato(3,"tal",'C');
		Dato d4=new Dato(2,"estas",'D');
		
		d1.showDato(1);
		d2.showDato(2);
		d3.showDato(3);
		d4.showDato(4);
		
		File archivo=new File("datos.txt");
		
		try {
			System.out.println("");
			System.out.println("[----] Preparando escritura de Objetos...");
			System.out.println("");
			FileOutputStream fos=new FileOutputStream(archivo);
			ObjectOutputStream oos=new ObjectOutputStream(fos); 
		
			oos.writeObject(d1);
			oos.writeObject(d2);
			oos.writeObject(d3);
			oos.writeObject(d4);

			System.out.println("[----] Escritos 4 Objetos en el archivo "+archivo.getName());
			System.out.println("");
			
		FileInputStream fis=new FileInputStream(archivo);
			ObjectInputStream ois=new ObjectInputStream(fis); 
			
			Dato da=new Dato();
			Dato db=new Dato();	
			Dato dc=new Dato();
			Dato dd=new Dato();

			System.out.println("[----] Instanciados 4 Objetos vacios...");
			System.out.println("");
						
			da=(Dato) ois.readObject();
			db=(Dato) ois.readObject();
			dc=(Dato) ois.readObject();
			dd=(Dato) ois.readObject();
			System.out.println("[----] Parseados 4 Objetos leidos en los 4 vacios...");
			System.out.println("");

			System.out.println("[----] Mostrando los Objetos leidos:");
			System.out.println("");
			da.showDato(1);
			db.showDato(2);
			dc.showDato(3);
			dd.showDato(4);
			System.out.println("");
			
		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
