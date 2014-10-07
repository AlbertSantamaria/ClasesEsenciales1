package edu.upc.eetac.dsa.asantamaria.ClasesEsenciales1;

import java.io.Serializable;

public class Dato implements Serializable{

	int num;
	String linea;
	char letra;
	
	Dato(){}
	
	Dato(int n,String s, char c)
	{
		num=n;
		linea=s;
		letra=c;
		
	}
	void showDato(int dat){
		System.out.println("Dato "+dat+" instanciado, contiene: "+ this.linea+", numero "+this.num+" y el caracter  "+this.letra  );
	}
}
